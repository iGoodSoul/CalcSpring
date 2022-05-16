package org.example;

import org.example.service.CalcOperations;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.SQLException;



@Component
public class MenuImpl extends ConsoleReaderImpl implements CalcOperations, Menu, ConsoleWriter,ConsoleReader {
    private UserService userService;





    public void mainMenu() throws SQLException, IOException {
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
                userService.regAcc(login, password);
                mainMenu();
                break;
            case "2":
                writeMessage("Insert login");
                login = readLine();
                writeMessage("Insert password");
                password = readLine();
                userService.checkLogin(login, password);
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

    public void userMenu() throws SQLException, IOException {

        writeMessage("1: Calculator");
        writeMessage("2: Exit");

        switch (readLine()) {
            case "1":
                mainMenu();
                break;
            case "2":

        }


    }

    @Override
    public double getDigit() {
        return 0;
    }

    @Override
    public char getOperation() {
        return 0;
    }

    @Override
    public double calc(double a, double b, char operation) {
        return 0;
    }

    @Override
    public void writeMessage(String message) {

    }
}
