package org.example;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static org.example.Operations.*;

@Component
public class Application {
    static Scanner sc = new Scanner(System.in);


    public void start() {
        for (int i = 0; i < 1; i++) {
            double a = getDigit();
        double b = getDigit();
        char operation = getOperation();
        double result = calc(a, b, operation);
        System.out.println("Result: " + result);
            System.out.println("Do you want to repeat it?");
            System.out.println("1: yes");
            System.out.println("any key : exit");
            int chose = sc.nextInt();
            if (chose == 1) {
                start();
                
            }else {
                System.out.println("Good bye");
                sc.close();
               i=1;
            }
    }
    }

}
