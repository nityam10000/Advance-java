package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller11 {

	@RequestMapping("/hi")
	public String reqHi() {
		return "bye.jsp";
	}
	
	@RequestMapping("/login")
	public String reqLogin() {
		return "login.jsp";
	}
	@RequestMapping("/register")
	public String reqRegister() {
		return "register.jsp";
	}
}
