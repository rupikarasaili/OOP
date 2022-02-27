package polymorphism;

public class testShape {
    public static void main(String[] args) {
        shape c = new circle();
        System.out.println("Area of circle  " + c.area(4));
        shape rect = new rectangle();
        System.out.println("Area of rectangle  " + rect.area(2, 3));
        shape tri = new triangle();
        System.out.println("Area of triangle  "+ tri.area(2.5f,4));
    }
}
