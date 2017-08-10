package com.riguz.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ServiceApp {
    public static void main(String[] args){
        System.out.println("Using spring contract..." + new Date().getTime());
        //SpringApplication.run(ServiceApp.class, args);
    }
}
