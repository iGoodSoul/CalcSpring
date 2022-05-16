package org.example.service;

import org.example.entity.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.SQLException;

@Component
public class UserServiceImpl implements UserService {
private UserRepository userRepository;

@Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User checkLogin(String login, String password) throws SQLException, IOException {
        return userRepository.checkUser(login,password);


    }

    @Override
    public User regAcc(String login, String password) throws SQLException, IOException {
       return userRepository.regUser(login,password);
    }
}
