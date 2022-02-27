package exception;

public class TestException {
    public static void main(String[] args) {
        int num = 5;
        for(int i =-2;i<3;i++){
            System.out.println(divideNumber(num,i));
        }
    }
    public static int divideNumber(int num, int i) {
        try {
            return num / i;
        } catch (Exception e) {
            System.out.println("Error aayo");
            return -100000;

        }finally{
            System.out.println("Finally running");
        }
    }
}
