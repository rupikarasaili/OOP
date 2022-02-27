package chapter5;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.next();
        }
        System.out.println("Arr element re: " );
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);

        }
    }
}
