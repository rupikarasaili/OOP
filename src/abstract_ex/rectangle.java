package abstract_ex;

public class rectangle extends shape{

    private int length;
    private  int breadth;
    rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    protected float area() {
        return length*breadth;
    }
}