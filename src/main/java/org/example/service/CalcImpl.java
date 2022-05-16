package org.example.service;

import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class CalcImpl implements CalcOperations, Calc {
    private Scanner sc;

    @Override
    public boolean calc(){
        while(true) {
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
               calc();

            } else {
                System.out.println("Good bye");
                sc.close();
                return false;
            }
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
}
