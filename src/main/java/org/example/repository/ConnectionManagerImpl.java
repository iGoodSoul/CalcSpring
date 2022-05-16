package org.example.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
@Repository
public class ConnectionManagerImpl implements ConnectionManager {
    private Properties properties;

    @Override
    public Connection getConnection() throws IOException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        FileInputStream in = new FileInputStream("db.properties");// try с ресурсами
        properties.load(in);
        String URL = properties.getProperty("url");
        String LOGIN = properties.getProperty("username");
        String PASSWORD = properties.getProperty("password");
       return DriverManager.getConnection(URL, LOGIN, PASSWORD);


    }
}
