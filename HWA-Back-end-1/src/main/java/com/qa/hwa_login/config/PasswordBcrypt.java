package com.qa.hwa_login.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PasswordBcrypt implements WebMvcConfigurer {
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bcryptpasswordencoder = new BCryptPasswordEncoder();
		return bcryptpasswordencoder;

}
}
