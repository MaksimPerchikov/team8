
package ru.hrhappiness.securityConfig;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.PasswordEncoder;

import ru.hrhappiness.auth.ApplicationUserService;
import ru.hrhappiness.jwt.JwtUsernameAndPasswordAuthenticationFilter;


@EnableGlobalMethodSecurity(prePostEnabled = true)
@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;
    private final ApplicationUserService applicationUserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilter(new JwtUsernameAndPasswordAuthenticationFilter(authenticationManager()))
                .authorizeRequests()//
                .antMatchers("/","index").permitAll()
                .antMatchers("/hrhappiness/hi").permitAll()// этот эндпоинт доступен для всех
                /*.antMatchers("/").hasAnyRole(
                        ADMIN.name(),
                        UP.name())
.antMatchers("/hrhappiness/all").hasAnyRole(
                        ADMIN.name(),
                        UP.name())//кому мы даем доступ к эндпоинтам
                .antMatchers("/hrhappiness/withoutDraft").hasAnyRole(
                        ADMIN.name(),
                        UP.name(),
                        RC.name(),
                        NO.name(),
                        NP.name())
 .antMatchers(HttpMethod.DELETE, "/hrhappiness/deleteDraft/{id}").hasAnyAuthority(
                        USER_PROJECT_CARD_DELETE_DRAFT.getPermission())
                       // USER_PROJECT_CARD_DELETE.getPermission())//чтобы пользоваться методами Делете по этому эндпоинту,нужно обладать пермишном таким(USER_PROJECT_CARD_DELETE_DRAFT)
                .antMatchers(HttpMethod.PUT, "/hrhappiness").hasAnyAuthority(
                        USER_PROJECT_CARD_UPDATE_CARD.getPermission(),
                        USER_PROJECT_CARD_ARCHIVING.getPermission(),
                        USER_PROJECT_CARD_RESTORING_FROM_ARCHIVE.getPermission())

.antMatchers("/hrhappiness/create").hasAuthority(USER_PROJECT_CARD_CREATE.getPermission())*/

                .anyRequest()
                .authenticated().and()
                .httpBasic();//должны быть авторизованы
                /*.and().formLogin().permitAll()
                .and().logout().permitAll()
                .and()
                .httpBasic();*/

        // .defaultSuccessUrl("/withoutDraft",true);//что видит пользователь после аутентификации


/*.passwordParameter("password")
                .usernameParameter("username")*/


/*.and()
                .logout()

                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                 .clearAuthentication(true)//после нажатия /logout удаляется информация о аутентификации
                .invalidateHttpSession(true)//HttpSession становится не валидным
                 .logoutSuccessUrl("/hrhappiness/log");//повторяя цикл*/


    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(daoAuthenticationProvider());
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder);
        provider.setUserDetailsService(applicationUserService);
        return provider;
    }

/*
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
*/

}

/*
        //базовая аутентификация
        .anyRequest()
        .authenticated()//должны быть авторизованы
        .and()
        .formLogin().permitAll()
        .and().logout().permitAll()
        .and()
        .httpBasic();*//*
 */
/*

 */
