package com.ironhack.usersservice.service.impl;

import com.ironhack.usersservice.model.User;
import com.ironhack.usersservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> optionalUser = userRepository.findByUsername(username);

        if(!optionalUser.isPresent()) {
            throw new UsernameNotFoundException("User not found");
        }

        return optionalUser.get();
    }
}
