package org.example.repository;

import org.example.entity.User;

import java.io.IOException;
import java.sql.SQLException;


public interface UserRepository {

   User checkUser(String login, String password) throws SQLException, IOException;
   User regUser (String login, String password) throws SQLException, IOException;
}
