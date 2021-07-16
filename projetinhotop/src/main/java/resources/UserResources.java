package resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import dto.UserDTO;

@RequestMapping(value = "/users")
public interface UserResources {

    @PostMapping
    ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO);


}
