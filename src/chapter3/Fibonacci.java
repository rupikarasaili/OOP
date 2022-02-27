package chapter3;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        while (num1 < range) {
            System.out.println(num1);
            num1 += num2;
            num2 = num1 - num2;

        }
    }
}
