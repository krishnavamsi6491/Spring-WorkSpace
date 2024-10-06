package com.vamsi.Controller;

import com.vamsi.Service.HelloService;

public class HelloController {

	private HelloService hs;
	public HelloController(HelloService hs) {
		this.hs=hs;
	}
	
	public String handleReqest()
	{
		return hs.getProcess();
	}
}
