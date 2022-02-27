package chapter2;

import java.util.Scanner;
public class ConsVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);
        if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch=='o'|| ch=='u') {
            System.out.print("It is a vowel character");
        }else{
            System.out.print("It is a consonant character");

        }
    }
}
