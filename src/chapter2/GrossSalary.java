package chapter2;

import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double basic;
        double da;
        double hra;
        double gross;

        System.out.print("Enter the basic salary: ");
        basic = sc.nextDouble();
        da = sc.nextDouble();
        hra = sc.nextDouble();
        gross = sc.nextDouble();

        if(basic<=10000) {
            da = basic * 0.8;
            hra = basic * 0.2;
            gross = da + hra +basic;
            System.out.print("The gross salary is "+ gross);
        }else if(basic<=20000) {
            da = basic * 0.9;
            hra = basic * 0.25;
            gross = da + hra +basic;
            System.out.print("The gross salary is "+ gross);
        }else if(basic>30000) {
            da = basic * 0.95;
            hra = basic * 0.30;
            gross = da + hra +basic;
            System.out.print("The gross salary is "+ gross);
        }

    }
}

