package com.chat.app.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.chat.app.models.Message;

@RestController // because yahan hm json return karne wale hain
public class MessageController {
	
	
	// ab yahan hme yahan message ko leke sare users ko dekhana hai
	
	@MessageMapping("/message") // message denge 
	@SendTo("/topic/return-to") // client ne subscribe krke rkha hai so by def message jaega
	public  Message getContent(@RequestBody Message message) {
		   
		try {
			// processing 
			
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return message;
		
	}

}
