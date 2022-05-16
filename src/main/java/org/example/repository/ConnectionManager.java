package org.example.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionManager {
    Connection getConnection() throws IOException, SQLException;

}
