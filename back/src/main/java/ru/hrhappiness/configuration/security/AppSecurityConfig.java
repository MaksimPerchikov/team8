package ru.hrhappiness.configuration.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import static ru.hrhappiness.configuration.security.ApplicationUserPermission.*;
import static ru.hrhappiness.configuration.security.ApplicationUserRole.*;


@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable() //поменять на .enable()
                .authorizeRequests()//
                //antMatchers -
                    .antMatchers("/hrhappiness/hi").permitAll()// этот эндпоинт доступен для всех(не работает)
                .antMatchers("/hrhappiness/all").hasAnyRole(ADMIN.name(),UP.name())//кому мы даем доступ к эндпоинтам
                .antMatchers("/hrhappiness/withoutDraft").hasAnyRole(ADMIN.name(),UP.name(),RC.name(),NO.name(),NP.name())
                .antMatchers(HttpMethod.DELETE,"/hrhappiness/deleteDraft/{id}").hasAnyAuthority(USER_PROJECT_CARD_DELETE_DRAFT.getPermission(),USER_PROJECT_CARD_DELETE.getPermission())//чтобы пользоваться методами Делете по этому эндпоинту,нужно обладать пермишном таким(USER_PROJECT_CARD_DELETE_DRAFT)
                .antMatchers(HttpMethod.PUT,"/hrhappiness").hasAnyAuthority(USER_PROJECT_CARD_UPDATE_CARD.getPermission(),USER_PROJECT_CARD_ARCHIVING.getPermission())
                .antMatchers(HttpMethod.POST,"/hrhappiness").hasAuthority(USER_PROJECT_CARD_CREATE.getPermission())
                .anyRequest()
                .authenticated()//должны быть авторизованы
                .and()
                    .httpBasic();//базовая аутентификация
    }

  @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        UserDetails maxUser = User.builder()
                .username("max")
                .password(passwordEncoder.encode("1"))
                .authorities(ADMIN.getAuthorities())
                .build();

      UserDetails artemUser = User.builder()
              .username("artem")
              .password(passwordEncoder.encode("2"))
              .authorities(UP.getAuthorities())
              .build();
      UserDetails krisUser = User.builder()
              .username("kris")
              .password(passwordEncoder.encode("3"))
              .authorities(RC.getAuthorities())
              .build();
      UserDetails glebUser = User.builder()
              .username("gleb")
              .password(passwordEncoder.encode("4"))
              .authorities(NO.getAuthorities())
              .build();
      UserDetails miUser = User.builder()
              .username("mi")
              .password(passwordEncoder.encode("5"))
              .authorities(NP.getAuthorities())
              .build();
        return new InMemoryUserDetailsManager(maxUser,artemUser,krisUser,glebUser,miUser);
    }

}
