package Arithmatic;
public class Main {
    int addR;
    int sub;
    double area;
    private int first;
    private int second;
    private int r;

    public int Addition(){
//        this.first = first;
//        this.second = second;
        addR = first+second;
        return addR;
    }

    public int Subraction(){
        sub = first-second;
        return sub;
    }

    public double Radii(){
        area = (double) (22/7)*r*r;
        return area;
    }

    public void setFirst(int first) {
        this.first = first;
    }
    public void setSecond(int second){
        this.second = second;
    }

    public void setR(int r){
        this.r = r;
    }
    public Main(){

    }

}


