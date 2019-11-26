package ru.digitos;

public class Operations {
    int firstNumber = 0;
    int secondNumber = 0;

    int addition() {
        return firstNumber + secondNumber;
    }

    int difference() {
        return firstNumber - secondNumber;
    }

    double division() {
        if (((double) firstNumber / (double) secondNumber) % ((double) firstNumber / (double) secondNumber) == 0)
            return firstNumber / secondNumber;
        else return (double) firstNumber / (double) secondNumber;
    }

    int multiplication() {
        return firstNumber * secondNumber;
    }
}
