package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String LoginPage() {
		return "LoginPage";
	}
	
	
	
	@PostMapping("/Login")
	public String Login(@RequestParam("loginId")String loginId,@RequestParam("password")String password) {
		
		if(loginId.equals(password)) {
			
			return "LoginOK";
		}else {
			return "LoginNG";
		}
		
		
	}
	
	
	
}
