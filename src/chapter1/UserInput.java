package chapter1;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // data representation
        int first;
        int second;
        int result;
        // step 2. user input
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();

        result = first + second;
        System.out.print("Sum of two numbers is :"+ result);
    }
}
