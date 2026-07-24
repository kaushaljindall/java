package chapter4;
import java.util.*;

public class M2_loopsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int ans = 0;
        while( number > 0){
            int n = number % 10 ;
            number = number / 10;
            ans += n;
        }

        System.out.println(ans);
        sc.close();
    }
}
