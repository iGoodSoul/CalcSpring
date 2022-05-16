package org.example;

import java.io.IOException;
import java.sql.SQLException;

public interface Menu {
    public void mainMenu() throws SQLException, IOException;
    public void userMenu() throws SQLException, IOException;
}
