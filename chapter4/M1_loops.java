package chapter4;

public class M1_loops {
    public static void main(String[] args) {
       int n = 123456;
       int i;
       for (i = 0 ; n >0 ; i++){
        n= n / 10;
       }
       System.out.println(i);
    }
}
