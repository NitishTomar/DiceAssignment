package com.example.forecast.services;

import com.example.forecast.model.User;
import com.example.forecast.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("Username doesn't exist"));
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), new ArrayList<>());
    }

    public User registerUser(User registrationDTO) {
        User user = new User();
        user.setUserName(registrationDTO.getUserName());
        user.setPassword(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(registrationDTO.getPassword()));
        return userRepository.save(user);
    }

    public boolean existsByUsername(String userName) {
        return userRepository.findByUserName(userName).isEmpty() ? false : true;
    }



}
