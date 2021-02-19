package org.oar.app.Repository;

import org.oar.app.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User,Integer>{

}
