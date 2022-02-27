package chapter1;

import java.util.Scanner;
public class rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length;
        int breadth;
        int area;
        int sqrt;

        System.out.print("Enter the length : ");
        length = sc.nextInt();
        System.out.print("Enter the breadth : ");
        breadth = sc.nextInt();

        area = length*breadth;
        sqrt = (int)Math.sqrt(area);
        if(sqrt * sqrt == area) {
            System.out.print("It is a square");
        }else{
            System.out.print("It is not a square");
        }
    }
}
