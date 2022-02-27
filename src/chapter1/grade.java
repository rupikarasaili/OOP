package chapter1;

import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.print("Enter your marks: ");
        marks = sc.nextInt();
        if(marks<=25) {
            System.out.print("Your chapter1.grade is F");
        }else if(marks>25 && marks<=45) {
            System.out.print("Your chapter1.grade is E");
        }else if(marks>45 && marks<=50) {
            System.out.print("Your chapter1.grade is D");
        }else if(marks>50 && marks<=60) {
            System.out.print("Your chapter1.grade is C");
        }else if (marks>60 && marks<=70) {
            System.out.print("Your chapter1.grade is B");
        } else{
            System.out.print("Your chapter1.grade is A");
        }

    }
}
