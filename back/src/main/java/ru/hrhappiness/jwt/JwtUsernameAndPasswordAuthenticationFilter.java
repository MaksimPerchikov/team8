package ru.hrhappiness.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.net.HttpHeaders;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
public class JwtUsernameAndPasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {// первый фильтр, перехватывает запрос

    private final AuthenticationManager manager;
    private final JwtProvider jwtProvider;
    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {

        try {
            UsernamePasswordRequest usernamePasswordRequest = new ObjectMapper() // это мы получаем модельку из запроса
                    .readValue(request
                            .getInputStream(),UsernamePasswordRequest.class);

            Authentication authentication = new UsernamePasswordAuthenticationToken(usernamePasswordRequest.getUsername(),
                    usernamePasswordRequest.getPassword()); //сюда мы передаем полученный нами рекьюест (usernamePasswordRequest)


            //теперь аутентифицируем
            Authentication authenticate =
                    manager.authenticate(authentication); //мы должны аутентифицировать пользователя и помещаем в данный метод Аутентификецшн(Authentication)



            return authenticate;

        } catch (IOException e) {
            log.error("Unexpected error", e);
            throw new RuntimeException();
        }
    }

    //после того,как пользователь авторизовался,вызывается этот метод
    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {
        String token = jwtProvider.createToken(authResult);//сгенерировали токен
        response.addHeader(HttpHeaders.AUTHORIZATION,token);//засунули в хедер респонса
        Map<String,String> mapNameTokenAndToken = new HashMap<>();

        mapNameTokenAndToken.put("tokenName",token);


        response.setContentType("application/json");
        objectMapper.writeValue(response.getOutputStream(),mapNameTokenAndToken);


    }
}
