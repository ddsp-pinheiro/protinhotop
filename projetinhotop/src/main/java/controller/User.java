package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.UserDTO;

@RestController
public class User {

	@PostMapping
	public ResponseEntity<UserDTO> creatUser(UserDTO userDTO) {
		return ResponseEntity.ok(userDTO);
	}
}
