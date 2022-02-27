package chapter1;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // data representation
        float principle;
        float rate;
        float time;
        float interest;
        // step 2. input

        System.out.print("Enter principle : ");
        principle = sc.nextFloat();
        System.out.print("Enter rate : ");
        rate = sc.nextFloat();
        System.out.print("Enter time : ");
        time = sc.nextFloat();

        interest = (principle * rate * time) / 100;
        System.out.print("Simple Interest is :"+ interest);

    }
}
