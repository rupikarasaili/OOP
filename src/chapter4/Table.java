package chapter4;

import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int multi = 0;
        for(int i = 1; i<11; i++){
            multi = num * i;
            System.out.println(num + " * " + i + " = " +  multi);
        }

    }
}
