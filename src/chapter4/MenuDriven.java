package chapter4;

import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. chapter2.Add two numbers");
        System.out.println("2. Simple Interest");
        System.out.println("3. chapter4.Palindrome");
        System.out.println("4. Odd Even");
        System.out.println("Enter your choice (1,2,3,4) : ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println("Enter first number: ");
                int num_one = sc.nextInt();
                System.out.print("Enter second number: ");
                int num_two = sc.nextInt();
                int sum = num_one+num_two;
                System.out.println("The sum is "+ sum);
                break;
            case 2:
                System.out.println("Enter principle: ");
                float principle = sc.nextInt();
                System.out.println("Enter rate: ");
                float rate = sc.nextInt();
                System.out.println("Enter time: ");
                float time = sc.nextInt();
                float interest = (principle*rate*time)/100;
                System.out.println("The simple interest is "+ interest);
                break;
            case 3:
                System.out.println("Enter number with two digits: ");
                int num = sc.nextInt();
                int rem = num % 10;
                int quot = num / 10;
                int result = rem * 10 + quot;
                if (result == num) {
                    System.out.print(num + " is palindrome");
                }else{
                    System.out.print(num + " is not palindrome");
                }
                break;
            case 4:
                System.out.println("Enter a number: ");
                int number = sc.nextInt();
                if ( number % 2 == 0) {
                    System.out.println("Even");
                }else{
                    System.out.println("Odd");
                }
                break;

        }

    }

    public static class Switch {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char chr = sc.next().toLowerCase().charAt(0);

            switch (chr){
                case 'a':
                    System.out.println("Vowel");
                    break;
                case 'e':
                    System.out.println("Vowel");
                    break;
                case 'i':
                    System.out.println("Vowel");
                    break;
                case 'o':
                    System.out.println("Vowel");
                    break;
                case 'u':
                    System.out.println("Vowel");
                    break;
                default:
                    System.out.println("Consonant");

            }
        }
    }
}
