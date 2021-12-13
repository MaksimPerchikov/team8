package ru.hrhappiness.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
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

@Slf4j
@RequiredArgsConstructor
public class JwtUsernameAndPasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {// первый фильтр, перехватывает запрос

    private final AuthenticationManager manager;

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

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

    }
}
