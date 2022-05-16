package org.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CalcOperationsIml implements CalcOperations{
    private Scanner sc;
    @Autowired
    public CalcOperationsIml(Scanner sc) {
        this.sc = sc;
    }
@Override
    public double getDigit() {
        System.out.println("Insert digit:");
        double num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Something wrong, try again.");
            sc.next();
            num = getDigit();
        }
        return num;
    }
    @Override
    public char getOperation() {
        System.out.println("Insert operation:");
        char operation;
        if (sc.hasNext()) {
            operation = sc.next().charAt(0);
        } else {
            System.out.println("Your insert not correct, try again");
            sc.next();
            operation = getOperation();
        }
        return operation;
    }


    public double calc(double a, double b, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Operation not found");
                result = calc(a, b, getOperation());
        }
        return result;
    }

}
