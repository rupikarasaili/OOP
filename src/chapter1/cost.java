package chapter1;

import java.util.Scanner;
public class cost {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quantity;
        float total;
        float discount;

        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();

        total = quantity * 100;
        if(total >= 1000) {
            discount = total - (total * 10 / 100);
            System.out.print("The total chapter1.cost is " + discount);
        }else{
            System.out.print("The total chapter1.cost is " + total);


        }



    }
}
