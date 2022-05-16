package org.example;

import org.springframework.stereotype.Component;

import java.util.Scanner;



@Component
public class ConsoleReaderImpl implements ConsoleReader {
    private Scanner scan;
@Override
public String readLine() {
    return scan.nextLine();
}
}