package mutable_immutable;

public final class ImmutableClass {
    private final int first;
    private final int second;
//constructor
    public ImmutableClass(int first, int second){
        this.first = first;
        this.second = second;
    }
    // getter
    public int getFirst(){
        return this.first;
    }
    public int getSecond(){
        return this.second;
    }
    // behavior
    public int add(){
        return this.first + this.second;
    }

}
