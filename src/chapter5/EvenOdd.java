package chapter5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int even = 0;
        int odd = 0;
        int[] arr = new int[size];
        for (int i = 1; i < size; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();

            }

        for (int i = 0; i< arr.length; i++){
            if (i%2==0){
                even++;
            }else{
                odd++;
            }

        }
        System.out.println("The total number of even " + even);
        System.out.println("The total number of odd " + odd);

        }
    }
