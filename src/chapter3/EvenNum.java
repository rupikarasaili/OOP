package chapter3;

public class EvenNum {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        for (int i=1; i<21; i++){
            if (i%2==0){
                even++;
            }else{
                odd++;
            }

        }
        System.out.println("No of even: " + even + ", No of odd: "+ odd);

    }
}
