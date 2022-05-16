package org.example;


import org.example.service.CalcOperations;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

@Component
public abstract class Application  implements Menu {




    public void start() throws SQLException, IOException {
        mainMenu();

    }

    public void addActionListener(ActionListener actionListener) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

    }


}





