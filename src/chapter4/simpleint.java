package chapter4;

import java.util.Scanner;
public class simpleint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle: ");
        float p = sc.nextFloat();
        System.out.println("Enter rate: ");
        float r = sc.nextFloat();
        System.out.println("Enter time: ");
        float t = sc.nextFloat();

        float si = interest(p,t,r);
        System.out.println("Simple interest is " + si);

    }
    public static float interest(float p, float r, float t){
        return (p*t*r)/100;
    }

}
