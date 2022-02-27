package chapter1;

import java.util.Scanner;
public class attendance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float class_held;
        float class_attended;
        float total;

        System.out.print("Enter no of classes held: ");
        class_held = sc.nextInt();
        System.out.print("Enter no of class attended: ");
        class_attended = sc.nextInt();

        total = (class_attended/class_held)*100;
        if(total>=75) {
            System.out.print("The total attendance is " + total + " so the student is allowed to sit in exam");
        }else{
            System.out.print("The total attendance is " + total + " so the student is not allowed to sit in exam");
        }

    }

}
