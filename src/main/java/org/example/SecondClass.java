package org.example;

public class Main {
    public static void main(String[] args) {
        SecondClass secondClassInstance = new SecondClass();

        // Виклик методу, що друкує значення поля і повертає його
        int value = secondClassInstance.printAndReturnValue();

        // Виведення в консоль зформатованого значення
        System.out.println("~~~ " + value + " ~~~");
        ;
    }
}