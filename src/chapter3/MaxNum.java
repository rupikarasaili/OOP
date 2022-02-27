package chapter3;

import java.util.Scanner;
public class MaxNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_one;
        int num_two;
        int num_three;

        System.out.print("Enter the first number: ");
        num_one = sc.nextInt();
        System.out.print("Enter the second number: ");
        num_two = sc.nextInt();
        System.out.print("Enter the third nummber: ");
        num_three = sc.nextInt();

        if(num_one>num_two && num_one>num_three) {
            System.out.print("The maximum number is " + num_one);
        }else if(num_two>num_three && num_two>num_one) {
            System.out.print("The maximum number is " + num_two);
        }else{
            System.out.print("The maximum number is "+num_three);
        }
    }
}
