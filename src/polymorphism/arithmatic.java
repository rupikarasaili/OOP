package polymorphism;

import java.util.Scanner;

public class arithmatic {
    public static void main(String[] args) {
        System.out.println(add(2, 3));
    }
    public static int add(int f, int s){
        return f+s;
    }
    public static float add(float f, int s){
        return f+s;
    }
    public static float add(int f, float s){
        return f+s;

    }    public static float add(float f, float s){
        return f+s;
    }

}
