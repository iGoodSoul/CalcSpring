package org.example.service;

import org.example.entity.User;

import java.io.IOException;
import java.sql.SQLException;

public interface UserService {
    User checkLogin(String login, String password) throws SQLException, IOException;

    User regAcc(String login, String password) throws SQLException, IOException;

}

