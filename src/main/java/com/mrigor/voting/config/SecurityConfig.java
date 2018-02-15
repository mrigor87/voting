package com.mrigor.voting.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by Игорь on 15.02.2018.
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    //private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {

        return super.authenticationManagerBean();
    }




    @Override
    protected void configure(HttpSecurity http) throws Exception { // @formatter:off
        http

                .requestMatchers().antMatchers("/","/login","/logout", "/oauth/authorize", "/oauth/confirm_access", "/profile/**","/v2/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/security", "/swagger-ui.html", "/webjars/**")
                .and()
                .csrf().disable()
                .formLogin()
                //   .loginPage("/login")
                .permitAll()
                .and()
                .logout()
                .permitAll()
         //       .and()

                //.and()
                .and().authorizeRequests().antMatchers("/profile/**","/","/swagger-ui.html"). hasRole("ADMIN")

        ;


    }

    // password encryptor
/*    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("ADMIN");
    }

}
