package chapter3;

import java.util.Scanner;
public class oldest_younger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age_1;
        int age_2;
        int age_3;

        System.out.print("Enter first age: ");
        age_1 = sc.nextInt();
        System.out.print("Enter second age: ");
        age_2 = sc.nextInt();
        System.out.print("Enter third age: ");
        age_3 = sc.nextInt();
        if(age_1>age_2 && age_1>age_3) {
            System.out.print("The oldest is" + age_1);
        }else if(age_1<age_2 && age_1<age_3) {
            System.out.print("The youngest is " + age_1);

        }else if(age_2>age_3 && age_2>age_1) {
            System.out.print("The oldest is " + age_2);
        }else if(age_2<age_3 && age_2<age_1){
            System.out.print("The youngest is " + age_2);

        }else if(age_3>age_1 && age_3>age_2) {
            System.out.print("The oldest is " + age_3);
        }else if(age_3<age_2 && age_3<age_1) {
            System.out.print("The youngest is " + age_3);

        }
    }
}
