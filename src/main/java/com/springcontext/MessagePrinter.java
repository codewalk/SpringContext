package com.springcontext;

import org.springframework.beans.facory.annotation.Autowird;
import org.springframework.stereotype.Component;
 
@Component
public class MessagePrinter 
{
	@Autowird
    private MessageService service;
	
	public void printMessage()
	{
		System.out.println(this.service.getMessage());
	}
}
