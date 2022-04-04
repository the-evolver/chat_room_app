package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer{

	@Override
	
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/server1").withSockJS();
		
		// message bhejne se phle client connectivity karega aur 
		// wo iss server1 wale url pe hogi 
	}

	@Override
	
	// built for send and receive message config work
	
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		
		registry.enableSimpleBroker("/topic"); // destination prefix 
		 // iss url pe broker enable hoga mtlb ye url broacasting ke liye use hoga 
		
		
		registry.setApplicationDestinationPrefixes("/app"); // jb koe message bhejega to sbse
		                                                    // sbse phle app dalega prefix then message 
		                                                    // implies mesaage /app/message pe jaega 
	}
	

}
