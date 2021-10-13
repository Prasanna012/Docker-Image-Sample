package com.hello.world.Docker_Image_Sample.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Demo {
	public String helloworld()
	{
		return "Hello world";
	}

}
