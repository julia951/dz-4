package org.example;

public class SecondClass {

    private int value = 21; // Поле типу int із заданим значенням

    // Метод, який повертає значення поля
    public int printAndReturnValue() {
        System.out.println("---" + value + "---");
        return value;
    }
}