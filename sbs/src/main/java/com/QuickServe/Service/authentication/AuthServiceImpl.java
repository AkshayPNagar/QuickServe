package com.QuickServe.Service.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuickServe.DTO.SingupRequestDTO;
import com.QuickServe.DTO.UserDto;
import com.QuickServe.Entity.User;
import com.QuickServe.Repo.UserRepo;
import com.QuickServe.enums.UserRole;

@Service
public class AuthServiceImpl implements AuthService{

	@Autowired
	private UserRepo userRepo;
	
	public UserDto signupCLient (SingupRequestDTO singupRequestDTO)
	{
		User user = new User();
		
		user.setName(singupRequestDTO.getName());
		user.setLastName(singupRequestDTO.getLastName());
		user.setEmail(singupRequestDTO.getEmail());
		user.setPhone(singupRequestDTO.getPhone());
		user.setPassword(singupRequestDTO.getPassword());
		
		user.setRole(UserRole.CLIENT);
		
		return userRepo.save(user).getDto();
	}
	
	public Boolean presentByEmail(String email)
	{
		return userRepo.findFirstByEmail(email)!=null;
	}
	
	
	public UserDto signupCompany(SingupRequestDTO singupRequestDTO)
	{
			User user = new User();
		
		user.setName(singupRequestDTO.getName());
		user.setEmail(singupRequestDTO.getEmail());
		user.setPhone(singupRequestDTO.getPhone());
		user.setPassword(singupRequestDTO.getPassword());
		
		user.setRole(UserRole.COMPANY);
		
		return userRepo.save(user).getDto();
	}
}
