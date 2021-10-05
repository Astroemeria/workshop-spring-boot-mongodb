package com.astroemeria.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astroemeria.workshopmongo.domain.User;
import com.astroemeria.workshopmongo.services.UserService;

@RestController //para dizer que a classe vai ser um recurso rest
@RequestMapping(value = "/users") //para dizer qual o caminho do endpoint
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria", "maria@gmail.com");
		User alex = new User("2", "Alex Santos", "alex@gmail.com");
		List<User> list = service.findAll(); //busca no banco de dados e guarda na lista
		return ResponseEntity.ok().body(list);
	}
}
