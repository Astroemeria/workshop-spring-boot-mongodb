package com.astroemeria.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.astroemeria.workshopmongo.domain.User;
import com.astroemeria.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired 
	private UserRepository repo; //mecanismo de injeção de depêndencia automatica do spring
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
