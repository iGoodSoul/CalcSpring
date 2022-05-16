package org.example;

import org.springframework.stereotype.Component;

import java.util.Scanner;



@Component
public class ConsoleReader {
    private Scanner scan;

public String readLine() {
    return scan.nextLine();
}
}