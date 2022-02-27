package chapter4;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int digit;


        System.out.print("Enter a number with two digits: ");
        digit = sc.nextInt();

        int rem = digit % 10;
        int quot = digit / 10;
        int result = rem * 10 + quot;

        if (result == digit) {
            System.out.print(digit + " is palindrome");
        }else{
            System.out.print(digit+ " is not palindrome");
        }
    }
}
