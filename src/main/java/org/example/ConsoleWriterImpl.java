package org.example;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriterImpl implements ConsoleWriter{
    @Override
    public void writeMessage(String message){
        System.out.println(message);
    }
}
