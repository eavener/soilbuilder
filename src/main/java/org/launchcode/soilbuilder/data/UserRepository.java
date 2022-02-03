package org.launchcode.soilbuilder.data;

import org.launchcode.soilbuilder.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
