package com.alexcaves.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String greeting(@RequestParam(value="name", required=false) String firstName) {
		if(firstName == null) {
			return "Hello human!  Welcome to SpringBoot!";
		}else {
			return "Hello " + firstName + "!  Welcome to SpringBoot!";
		}
	}
}
