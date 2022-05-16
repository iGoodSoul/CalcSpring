package org.example;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {
    public static void writeMessage(String message){
        System.out.println(message);
    }
}
