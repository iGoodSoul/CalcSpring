package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;


@ComponentScan("org.example")
public class RootConfiguration {



    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

}
