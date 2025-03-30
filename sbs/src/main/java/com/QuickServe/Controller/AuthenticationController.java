package com.QuickServe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.QuickServe.DTO.SingupRequestDTO;
import com.QuickServe.DTO.UserDto;
import com.QuickServe.Service.authentication.AuthService;

@RestController
public class AuthenticationController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("client/sign-up")
	public ResponseEntity<?> signupClient(@RequestBody SingupRequestDTO singupRequestDTO)
	{
		if(authService.presentByEmail(singupRequestDTO.getEmail()))
		{
			return new ResponseEntity<>("Client Already Exists with this Email", HttpStatus.NOT_ACCEPTABLE);
		}
		
		UserDto createdUser=authService.signupCLient(singupRequestDTO);
		return new ResponseEntity<>(createdUser, HttpStatus.OK);				
	}
	
	@PostMapping("company/sign-up")
	public ResponseEntity<?> signupCompany(@RequestBody SingupRequestDTO singupRequestDTO)
	{
		if(authService.presentByEmail(singupRequestDTO.getEmail()))
		{
			return new ResponseEntity<>("Company Already Exists with this Email", HttpStatus.NOT_ACCEPTABLE);
		}
		
		UserDto createdUser=authService.signupCLient(singupRequestDTO);
		return new ResponseEntity<>(createdUser, HttpStatus.OK);				
	}
}
