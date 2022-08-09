package com.ironhack.usersservice.controller.interfaces;

import com.ironhack.usersservice.controller.dto.UserDTO;
import com.ironhack.usersservice.model.User;

import java.util.List;

public interface UserController {
    UserDTO register(UserDTO userDTO);
    List<UserDTO> findAll();
    UserDTO login(User user);
}
