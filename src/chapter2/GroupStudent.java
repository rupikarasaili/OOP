package chapter2;

import java.util.Scanner;
public class GroupStudent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        boolean male;


        System.out.print("Enter the age of student: ");
        age = sc.nextInt();
        System.out.print("Type true for male and false for female: ");
        male = sc.nextBoolean();

        if (age>20){
            if (male)
                System.out.print("Man");
            else
                System.out.print("Boy");

        }
        else{
            if (age < 20)
                System.out.print("Girl");
            else
                System.out.print("Woman");



        }
    }
}

