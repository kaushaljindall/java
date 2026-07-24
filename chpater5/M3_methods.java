package chpater5;
import java.util.Scanner;

class Algebra{
    public int sum(int a , int b){
        return (a+b);
    }

     public int sub(int a , int b){
        return (a-b);
    }
}

public class M3_methods {
    public static void main(String[] args) {
        
    
        Algebra cal = new Algebra();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the Sum of "+ a + " and " + b + " is " + cal.sum(a,b));

        sc.close();
    }
}
