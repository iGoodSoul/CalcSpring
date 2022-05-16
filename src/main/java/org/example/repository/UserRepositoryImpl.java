package org.example.repository;

import org.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@Repository
public class UserRepositoryImpl implements UserRepository {
    private ConnectionManager connectionManager;

    @Autowired
    public UserRepositoryImpl(ConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public User checkUser(String login, String password) throws SQLException, IOException {
       Connection conn = connectionManager.getConnection();

        String sqlLog = "SELECT * FROM users WHERE login = ? and password = ?";
        PreparedStatement statement = conn.prepareStatement(sqlLog);
        statement.setString(1, login);
        statement.setString(2, password);

        ResultSet result = statement.executeQuery();

        User user = null;

        if (result.next()) {
            user = new User();
        }
        result.close(); //try с ресурсами
        statement.close();
        conn.close();

        return user;
    }

    @Override
    public User regUser(String login, String password) throws SQLException, IOException {
        Connection conn = connectionManager.getConnection();
        String sqlReg = "Insert Into users (login,password,name) VALUES(?,?,?);";
        PreparedStatement statement = conn.prepareStatement(sqlReg);
        statement.setString(1, login);
        statement.setString(2, password);
        int result = statement.executeUpdate();


        User user = null;

        if (result == 3) {
            user = new User();
        }
        statement.close();

        return user;
    }
}
