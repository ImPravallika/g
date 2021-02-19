package org.oar.app.controller;

import javax.transaction.Transactional;

import org.oar.app.Repository.UserRepository;
import org.oar.app.Service.UserService;
import org.oar.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class RestController {
	@Autowired
	UserService service;
	@PostMapping("/save-user")
	@Transactional
	public String registerUser(User user)
	{
		service.save( user);
		return "hello" +user.getFirstname()+"your registration is successfull";
	}

}
