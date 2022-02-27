package mutable_immutable;

//public class SimpleInterest {
//    public float principle;
//    public float rate;
//    public float time;
//}

public class SimpleInterest{
    private float principle;
    private float rate;
    private float time;

    SimpleInterest(){
        principle = 0;
        rate = 0;
        time = 0;
    }

    public SimpleInterest(float p, float r, float t) {
        principle = p;
        rate = r;
        time = t;
    }
    public void setPrinciple(float principle){
        if (principle<=0)
            throw new IllegalArgumentException("Principle cant be less than or equal to zerp");
        this.principle = principle;

    }
    public void setRate(float rate){
        if (rate<=0)
            throw new IllegalArgumentException("primciple cant be less than zero");
        this.rate = rate;

    }
    public void setTime(float time){
        if (time<=0)
            throw new IllegalArgumentException("time cant be zero");
        this.time= time;

    }

}