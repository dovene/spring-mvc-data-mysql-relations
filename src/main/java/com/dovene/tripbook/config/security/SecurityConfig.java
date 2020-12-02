package com.dovene.tripbook.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
      //  auth.inMemoryAuthentication().withUser("am").password("123").roles("ROLE_USER");
      //  auth.inMemoryAuthentication().withUser("you").password("123").roles("ROLE_ADMIN");
    /*   auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("select username,password, enabled from users where username=?")
                .authoritiesByUsernameQuery("select username, role from user_roles where username=?");

    */}


    @Override
    protected void configure(HttpSecurity http) throws Exception {

       /* http.authorizeRequests()
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")

              //  .antMatchers("/dashboard").hasAnyRole("ROLE_ADMIN","ROLE_USER")

                .and()
                .formLogin().loginPage("/login").failureUrl("/login?error")
                .defaultSuccessUrl("/dashboard")
                .usernameParameter("username").passwordParameter("password")
                .and()
                //.logout().logoutSuccessUrl("/login?logout")
                //.and()
                //.exceptionHandling().accessDeniedPage("/403")
                //.and()
                .csrf();
        */
       /* http
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll()//.failureUrl("/login?error")
                .defaultSuccessUrl("/dashboard")
                .usernameParameter("username").passwordParameter("password")
                .and()
                .logout().logoutSuccessUrl("/login?logout")
                .and()
                .csrf();*/
    }
}