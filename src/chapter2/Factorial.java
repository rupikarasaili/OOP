package chapter2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter first number: ");
            int first = sc.nextInt();
            System.out.println("Enter second number: ");
            int second = sc.nextInt();
            int result = first + second;
            System.out.println("Sum is" + result);
            System.out.println("Do you want to continue?");
            ch = sc.next().toLowerCase().charAt(0);

        } while (ch == 'y');
    }
}
