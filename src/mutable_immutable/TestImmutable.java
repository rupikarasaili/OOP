package mutable_immutable;
public class TestImmutable {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(10,15);
        System.out.println("Sum is" + immutableClass.add());
    }
}