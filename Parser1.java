package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Parser1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line;



        while(!"quit".equalsIgnoreCase(line = scanner.nextLine())){
            String[] exp = line.split(" ");
            if(exp.length != 3) {
                System.out.println("Invalid expression received: " + line);
                continue;
            }
           try {
               int operand1 = Integer.parseInt(exp[1]);
               int operand2 = Integer.parseInt(exp[2]);
               String operator = (exp[0]);


               int result = evaluate(operator, operand1, operand2);
               System.out.println(result);
           } catch(NumberFormatException e){

               System.out.println("Invalid received " + line);
               continue;
           } catch(Exception e){

           }



        }

    }
    private static int evaluate(String operator, int operand1, int operand2) {

        switch(operator) {
            case "ADD":
                return operand1 + operand2;

            case "SUB":
                return operand1 - operand2;

            case "DIV":
                if (operand2 == 0) {
                    throw new IllegalArgumentException("cannot divide to 0");

                }
                return operand1 / operand2;

            case "MUL":
                return operand1 * operand2;

            default:
                throw new UnsupportedOperationException("Operation not supported");
        }

    }

}
