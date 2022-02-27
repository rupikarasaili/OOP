package polymorphism;

public class shape {
    public float area(float radius){
        return 3.14f*radius+radius;
    }
    public float area(int l, int b){
        return l*b;
    }
    public float area(float b, float h){
        return 0.5f*b*h;
    }
}
