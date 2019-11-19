package ru.digitos;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    Operations calcOperation = new Operations();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String operation = null;
        String firstNumber = null;
        String secondNumber = null;




	    calcOperation.firstNumber = Integer.parseInt(bufferedReader.readLine());
        operation = bufferedReader.readLine();
	    calcOperation.secondNumber = Integer.parseInt(bufferedReader.readLine());

	    switch (operation) {
            case "+": System.out.println(calcOperation.addition());
            break;

            case "-": System.out.println(calcOperation.difference());
            break;

            case "/": if (calcOperation.secondNumber == 0) System.out.println("You can't divide by zero! Please enter a number not equal to zero.");
                        else System.out.println(calcOperation.division());
            break;

            case "*": System.out.println(calcOperation.multiplication());
            break;
            default: System.out.println("Invalid operation entered! Please enter the correct operation (+, -, /, *).");
            break;
        }
    }
}
