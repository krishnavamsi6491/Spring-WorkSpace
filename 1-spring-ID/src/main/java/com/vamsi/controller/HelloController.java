package com.vamsi.controller;

import com.vamsi.service.HelloService;

public class HelloController {

	private HelloService hs;
	public HelloController(HelloService hs) {
		this.hs=hs;
	}
	public String handleRequest(){
		return hs.getProcess();
	}
}
