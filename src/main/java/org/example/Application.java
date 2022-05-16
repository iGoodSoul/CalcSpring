package org.example;

import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.springframework.stereotype.Component;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;



@Component
public abstract class Application  implements Menu,ConsoleReader,ConsoleWriter, UserService {
private Scanner sc;
private Application application;


    public void start() throws SQLException, IOException {
        String login;
        String password;
        writeMessage("1: Registration");
        writeMessage("2: Login");
        switch (readLine()) {
            case "1":
                writeMessage("Insert login");
                login = readLine();
                writeMessage("Insert password");
                password = readLine();
                application.regAcc(login, password);
                mainMenu();
                break;
            case "2":
                writeMessage("Insert login");
                login = readLine();
                writeMessage("Insert password");
                password = readLine();
                application.checkLogin(login, password);
                if (true) {
                    userMenu();
                } else {
                    writeMessage("Not correct login or password, try again");
                    mainMenu();
                }

                break;
            default:
                writeMessage("Something wrong, try again");
                mainMenu();
        }

    }

    public void addActionListener(ActionListener actionListener) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

    }


}





