package polymorphism;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println(area(7));
    }

    public static float area(int f) {
        return 3.14f * f * f;

    }

    public static float area(float f) {
        return 3.14f * f * f;
    }
}
