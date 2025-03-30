package com.QuickServe.DTO;

import lombok.Data;

@Data
public class SingupRequestDTO {
	
	private long id;

	private String email;
	
	private String password;
	
	private  String name;
	private  String lastName;
	private  String phone;

}
