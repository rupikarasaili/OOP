package chapter4;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;

        int reverse = 0;
        while(num!=0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num/10;
        }
        System.out.println("Reverse of the number is: "+ reverse);
        if (reverse == temp){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
