package com.instruMental.configs;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityAppConfig {

	
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
      
    	
    	
		@SuppressWarnings("deprecation")
		UserDetails user1 = User.withDefaultPasswordEncoder()
		    .username("admin") 
            .password("1234")   
            .roles("Administrador") 
            .build();
		
	
		
        InMemoryUserDetailsManager InMemory = new InMemoryUserDetailsManager();
        
        //Se cargan los usuarios.
        InMemory.createUser(user1);
      
       
        return InMemory;
    } 
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        

    	http.authorizeRequests()
    	 		.regexMatchers("/styles/*.*") 
    	 			.permitAll()
    	 		.regexMatchers("/img/*.*")   
    	 			.permitAll() 
    	 		.regexMatchers("/js/*.*") 
    	 			.permitAll()

        	 	.regexMatchers("/")      
    	 			.permitAll() 
    	 	
    	 		
    				.regexMatchers("/wp-admin")    
    	 			.permitAll() 
    	 			
    	 			.antMatchers("/login/**\"")     
    	 			.permitAll() 
    	 			
    	 			.antMatchers("/admin/**").hasRole("Administrador")
    	 			.anyRequest()
    	 			.authenticated() 
    	 				.and()
    	 					.formLogin() 
    	 						.loginPage("/login") 
    	 						.loginProcessingUrl("/loginprocess") 
    	 						.permitAll() 
    	 				.and()
    	 					.logout().permitAll(); 
    	

        return http.build();
    }
      
    @Bean
    public AuthenticationEventPublisher authenticationEventPublisher
            (ApplicationEventPublisher applicationEventPublisher) {
        return new DefaultAuthenticationEventPublisher(applicationEventPublisher);
    }
}