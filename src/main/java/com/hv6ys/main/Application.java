package com.hv6ys.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main application to run boot application.
 *
 * @author Seyi Akintan
 * @version 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages="com.hv6ys")
//@ComponentScan("")
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}