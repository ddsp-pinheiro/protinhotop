package utils;

import org.springframework.stereotype.Component;

import dto.UserDTO;
import model.User;

@Component
public class UserConverter {
	
	public User toUser(UserDTO userDTO) {
        var user = new User();
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());

        return user;
    }

    public UserDTO toDto(User user) {
        var userDto = new UserDTO();
        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        userDto.setPassword(user.getPassword());

        return userDto;
    }
}
