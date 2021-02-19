package org.oar.app.Service;

import org.oar.app.Repository.UserRepository;
import org.oar.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	public UserService()
	{
		
	}

	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

}
