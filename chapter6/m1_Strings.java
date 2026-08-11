package chapter6;
import java.util.*;

public class m1_Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // char[] arr = new char[10];

        String str = "Kaushal Jindal";
        System.out.println(str);

        // Input string
        String name = sc.nextLine();
        System.out.println(name);

        // String length 
        int len = str.length();
        System.out.println(len);

        sc.close();
    }
}
