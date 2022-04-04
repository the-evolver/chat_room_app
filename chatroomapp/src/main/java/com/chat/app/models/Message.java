package com.chat.app.models;

public class Message {
	
	// message ke undar jo jo chiz rakhna chahte ho rakh lenge yahan
	
	  
	 private String name;       // name of messenger
	 private String content;   //  jo  message bhezi woo kya hai
	 
	  // constructor 
	public Message(String name, String content) {
		
		this.name = name;
		this.content = content;
		
	}
	
	
    // getters and setters 
    
	public String getName() {
		
		return name;
		
	}
	public void setName(String name) {
		
		this.name = name;
		
	}
	public String getContent() {
		
		return content;
		
	}
	public void setContent(String content) {
		
		this.content = content;
		
	}
    
    
}
