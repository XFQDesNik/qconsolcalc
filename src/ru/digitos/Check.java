package ru.digitos;

public class Check {
    protected static boolean isNumeric(String numberString) {
        try {
            Integer.parseInt(numberString);
            return true;
        } catch (NumberFormatException numberException) {
            return false;
        }
    }
}
