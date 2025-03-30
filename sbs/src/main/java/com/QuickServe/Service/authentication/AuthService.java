package com.QuickServe.Service.authentication;

import com.QuickServe.DTO.SingupRequestDTO;
import com.QuickServe.DTO.UserDto;

public interface AuthService {

	public UserDto signupCLient (SingupRequestDTO singupRequestDTO);
	
	public Boolean presentByEmail(String email);
	
	public UserDto signupCompany(SingupRequestDTO singupRequestDTO);

}
