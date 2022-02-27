package chapter4;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number having two or more digits: ");
        int digits = sc.nextInt();


        int sum = 0;
        while(digits!=0){
            int rem = digits % 10;
            sum = rem + sum;
            digits = digits/10;
        }
        System.out.println(sum);

    }
}
