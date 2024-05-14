package org.example;

public class Main {
    public static void main(String[] args) {
        SecondClass secondClassObj = new SecondClass();

        int value = secondClassObj.printAndReturnValue(); // Виклик методу, що повертає значення поля

        // Виведення в консоль зформатованого значення
        System.out.println("~~~ " + value + " ~~~");
    }
}