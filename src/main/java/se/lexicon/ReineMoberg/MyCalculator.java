package se.lexicon.ReineMoberg;

import java.util.Scanner;       //Import this package

public class MyCalculator {

    public static void main(String[] args) {

        System.out.println("Welcome to my calculator");
        System.out.println("Enter an operation type (+,-) or quit (q): ");
        Scanner sc = new Scanner(System.in);        //Create scanner object
        String operationType = sc.next();           //Wait for user input
        if (!operationType.equals("q")){            //Compare character
            System.out.println("Enter a number 1: ");
            int number1 = sc.nextInt();                 //Wait for user input
            System.out.println("Enter number 2: ");
            int number2 = sc.nextInt();                 //Wait for user input
            switch (operationType){                     //Error check and calculation
                case "+" :                              //If +, then add
                    System.out.println(number1 + number2);
                    break;                              //Break loop
                case "-" :                              //If -, then subtract
                    System.out.println(number1 - number2);
                    break;
                default :                               //Invalid character
                    System.out.println("Operation type is not valid.");
            }

        }else{
            System.out.println("Ok, see you!");
        }
    }
}

