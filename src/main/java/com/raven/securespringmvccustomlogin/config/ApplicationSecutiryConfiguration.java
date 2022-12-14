package com.raven.securespringmvccustomlogin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class ApplicationSecutiryConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder userBuilder = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication().withUser(userBuilder.username("admin").password("admin123").roles("ADMIN"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/showCustomLoginPage")
				.loginProcessingUrl("/authenticateTheUser").permitAll().and().logout().permitAll();

//		http.authorizeRequests().antMatchers("/css/**").permitAll().anyRequest().authenticated().and().formLogin()
//				.loginPage("/showCustomLoginPage").loginProcessingUrl("/authenticateTheUser").permitAll();
	}

}
