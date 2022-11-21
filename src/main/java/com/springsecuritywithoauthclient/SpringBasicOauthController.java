package com.springsecuritywithoauthclient;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth/secure")
public class SpringBasicOauthController {
	
	
	@GetMapping("/rest/token")
	public String createOauthclient( ) {
		return "Welcome to Spring Oauth client authorization example" ;
	}

}
