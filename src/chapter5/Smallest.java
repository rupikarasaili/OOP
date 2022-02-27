package chapter5;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }

        }
        System.out.println("Minimum value in the array is: " +min);
    }
}
