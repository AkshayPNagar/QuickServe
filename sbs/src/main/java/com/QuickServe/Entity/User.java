package com.QuickServe.Entity;

import com.QuickServe.DTO.UserDto;
import com.QuickServe.enums.UserRole;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String email;
	
	private String password;
	
	private  String name;
	private  String lastName;
	private  String phone;
	
	private UserRole role;
	
	public UserDto getDto()
	{
		UserDto userDto= new UserDto();
		userDto.setId(id);
		userDto.setName(name);
		userDto.setLastName(lastName);
		userDto.setEmail(email);
		userDto.setRole(role);
		
		return userDto;
	}

}
