package com.vamsi.MessageController;

//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller

public class MessageController {
	 @RequestMapping(path="/hello")
	public String Message() {
		System.out.println("MessageController");
		return "hellopage";
	}
}
