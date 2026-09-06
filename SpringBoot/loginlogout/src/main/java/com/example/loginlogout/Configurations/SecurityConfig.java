package com.example.loginlogout.Configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


import com.example.loginlogout.Service.LoginlogoutUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private LoginlogoutUserDetailsService lud;

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(c -> c.disable())

            .authorizeHttpRequests(request -> request
                .requestMatchers(
                    "/registration",
                    "/login",
                    "/css/**",
                    "/js/**"
                ).permitAll()
                .anyRequest().authenticated()
            )

            .formLogin(form -> form
                .loginPage("/login")
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/welcome", true)
                .permitAll()
            )

            .logout(form -> form
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutSuccessUrl("/login?logout")
                .permitAll()
            );

        return http.build();
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth)
            throws Exception {

        auth.userDetailsService(lud)
            .passwordEncoder(passwordEncoder());
    }
}