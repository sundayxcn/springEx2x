//package com.sunday.usercenter.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserDetailsService userDetailsService;
//
//    @Bean
//    public PasswordEncoder getPw() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        //http.formLogin().and().authorizeRequests().anyRequest().authenticated().and().csrf().disable();
//
//
//
//        //授权认证
//        http.formLogin().and().authorizeRequests().anyRequest().authenticated().and().csrf().disable();
//                //error.html不需要被认证
////                .antMatchers("/user/*.html").permitAll()
////                //login.html不需要被认证
////                .antMatchers("/login.html").permitAll()
////                //指定角色访问
////                .antMatchers("/main.html").hasRole("abc")
////                //指定权限访问
////                .antMatchers("/main.html").hasAuthority("admin")
////                //多个权限都可访问
////                .antMatchers("/main.html").hasAnyAuthority("admin,normal")
////                //多个角色都可以访问
////                .antMatchers("/main.html").hasAnyRole("ABC,abc")
////                //通过指定ip地址进行访问,注意这里的ip与localhost转换的ip是不一样的，线上一般为服务器ip
////                .antMatchers("/main.html").hasIpAddress("127.0.0.1")
//                //所有请求都必须被认证，必须登录之后被访问
////                .anyRequest().authenticated();
////
////        //关闭csrf防护
////        http.csrf().disable();
//    }
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
//    }
//}
//