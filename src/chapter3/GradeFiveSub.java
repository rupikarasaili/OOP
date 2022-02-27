package chapter3;

import java.util.Scanner;
public class GradeFiveSub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float physics;
        float chemistry;
        float maths;
        float biology;
        float computer;
        float total;
        float percentage;

        System.out.print("Enter the marks for physics: ");
        physics = sc.nextFloat();
        System.out.print("Enter the marks for chemistry: ");
        chemistry = sc.nextFloat();
        System.out.print("Enter the marks for maths: ");
        maths = sc.nextFloat();
        System.out.print("Enter the marks for biology: ");
        biology = sc.nextFloat();
        System.out.print("Enter the marks for computer: ");
        computer = sc.nextFloat();

        total = physics+chemistry+maths+biology+computer;
        percentage = total/5;
        if(percentage>=90) {
            System.out.print("Grade A");
        }else if(percentage>=80){
            System.out.print("Grade B");
        }else if(percentage>=70) {
            System.out.print("Grade C");
        }else if(percentage>=60) {
            System.out.print("Grade D");
        }else if(percentage>=40) {
            System.out.print("Grade E");
        }else if(percentage<40){
            System.out.print("Grade F");
        }

    }
}
