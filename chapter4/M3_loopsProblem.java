package chapter4;

public class M3_loopsProblem {
    public static void main(String[] args) {
        int num = 123456;
        int reverse = 0;
        while(num  > 0){
            int current = num % 10;
            num = num / 10;
            reverse = (reverse* 10) + current; 
        }
        System.out.println(reverse);
    }
}
