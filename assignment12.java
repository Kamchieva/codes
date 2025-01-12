import java.util.Scanner;

public class assignment12 {

    public static boolean isPrime(int number) {

        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
            if (number % i == 0) {
                return false;
            }
        System.out.println("It is a prime number!");
        return true;

    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number!");
            int numbers = scanner.nextInt();
            System.out.println(isPrime(numbers));




        }
    }


