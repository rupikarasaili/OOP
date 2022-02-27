package chapter2;

public class Add {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int end =20;
        for (int i = 1; i<20; i++){
            if (i%2==1){
                odd+=i;
            }

        }
        int lastEven = 0;
        if (end % 2 ==0)
            lastEven = end;
        else if ((end -1)%2==0)
            lastEven = end -1;
        System.out.println((odd + lastEven ));

    }
}
