package chapter5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a value to search: " );
        int searchValue = sc.nextInt();
        for (int i = 0; i< arr.length; i++){

            System.out.print(arr[i]);

        }
    }
}
