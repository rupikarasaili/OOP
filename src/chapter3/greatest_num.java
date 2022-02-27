package chapter3;

import java.util.Scanner;
public class greatest_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num_one;
        float num_two;
        float result;

        System.out.print("Enter the first number: ");
        num_one = sc.nextFloat();
        System.out.print("Enter second number: ");
        num_two = sc.nextFloat();
        if(num_one>num_two) {
            System.out.print("The greatest number is " + num_one);
        }else{
            System.out.print("The greatest number is "+ num_two);
        }

    }
}
