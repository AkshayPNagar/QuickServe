package com.QuickServe.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QuickServe.Entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

	User findFirstByEmail(String email);
	
}
