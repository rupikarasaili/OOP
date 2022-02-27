package abstract_ex;

public class circle extends shape {
    private float radius;
    circle(float radius){
        this.radius = radius;
    }

    @Override
    protected float area() {
        return (float) (3.14*radius*radius);
    }
}
