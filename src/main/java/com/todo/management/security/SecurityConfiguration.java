//package com.todo.management.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.FilterChainProxy;
//
//@SuppressWarnings("deprecation")
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
//	@Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.inMemoryAuthentication().withUser("user")
//            .password(passwordEncoder().encode("password"))
//                .roles("USER", "ADMIN");
//    }
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/login", "/h2-console/**").permitAll()
//                .antMatchers("/", "/*todo*/**").access("hasRole('USER')").and()
//                .formLogin();
//        
//        http.csrf().disable();
//        http.headers().frameOptions().disable();
//    }
//
//}
