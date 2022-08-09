package com.ironhack.usersservice.service.interfaces;

import com.ironhack.usersservice.controller.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO store(UserDTO user);
    List<UserDTO> findAll();
}
