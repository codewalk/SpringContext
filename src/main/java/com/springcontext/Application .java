package com.springcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class Application 
{
	@Bean
	MessageService mockMessageService()
	{
		return new MessageService(){
			public String getMessage()
			{
				return "Hello World!";
			}
		};
	}
	
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplictionContext(Application.class);
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
    }
}
