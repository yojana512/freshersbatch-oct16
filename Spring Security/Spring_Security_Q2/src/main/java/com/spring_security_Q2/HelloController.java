package com.spring_security_Q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
	@RequestMapping("/user")
	public String home() {
		System.out.println("Hii");
		return "user.jsp";
	}

}
