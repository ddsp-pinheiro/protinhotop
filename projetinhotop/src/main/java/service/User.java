package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.UserDTO;
import repository.UserRepository;
import utils.UserConverter;

@Service
public class User {
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	UserConverter userConverter;
	
	public UserDTO createUser(UserDTO userDTO) {
        var convertedUser = userConverter.toUser(userDTO);
        var createdUser = repository.save(convertedUser);
        return userConverter.toDto(createdUser);
    }
}
