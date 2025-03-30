package com.QuickServe.DTO;

import com.QuickServe.enums.UserRole;

import lombok.Data;
@Data
public class UserDto {
	private long id;

	private String email;
	
	private String password;
	
	private  String name;
	private  String lastName;
	private  String phone;
	
	private UserRole role;

}
