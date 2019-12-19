package com.wlwq.idfa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author lzh
 * security安全认证过滤
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .authorizeRequests()
                //普通的接口不需要校验
                .antMatchers("/admin/**").permitAll()
                // swagger页面需要添加登录校验
                .antMatchers("/swagger-ui.html").authenticated()
                .and()
                .formLogin();
    }
}
