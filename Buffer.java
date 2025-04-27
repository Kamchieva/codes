package org.example;
import java.util.Scanner;

public class Buffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            String command = tokens[0];

            switch (command) {
                case "PRINT":
                    System.out.println(tokens[1]);
                    break;
                case "ADD":
                    int sum = Integer.parseInt(tokens[1]) + Integer.parseInt(tokens[2]);
                    System.out.println("Result: " + sum);
                    break;
                case "SUB":
                    int diff = Integer.parseInt(tokens[1]) - Integer.parseInt(tokens[2]);
                    System.out.println("Result: " + diff);
                    break;
                case "EXIT":
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}