package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalFormatTest {
    public static void main(String[] args){
        String pattern = "0,00,00.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        System.out.print(decimalFormat.format( 1245363.23434));

    }

    public static class one {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first no: ");
            int first = sc.nextInt();
            System.out.println("Enter second no: ");
            int second = sc.nextInt();
            System.out.println("Enter third no: ");
            int third = sc.nextInt();

            int bhada = milk(first, second, third);
            System.out.println("sum is " + bhada);
        }
        public static int milk(int first, int second, int third){
            return first + second;
        }
    }
}
