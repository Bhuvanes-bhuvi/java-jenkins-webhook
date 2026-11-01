package com.example;

public class App {

    public static String greet(String name) {
        return "Hello " + name + "! Welcome to Jenkins and SonarQube.";
    }

    public static void main(String[] args) {
        System.out.println(greet("Java"));
        System.out.println("Application executed successfully!");
    }
}
