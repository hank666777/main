package com.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        // 設置HSTS
        http.headers()
                .httpStrictTransportSecurity()
                .includeSubDomains(true)
                .maxAgeInSeconds(31536000);

        // 設置X-Content-Type-Options: nosniff
        http.headers().contentTypeOptions();

        // 設置X-XSS-Protection
        http.headers().xssProtection().xssProtectionEnabled(true).block(true);

        http.authorizeRequests().antMatchers("/**").permitAll();
    }
}
