package chapter6;
import java.util.*;

public class m2_Strings {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        String str = "Kaushal Jindal";  


        //CharAt
        for(int i = 0 ; i < str.length() ; i++){
            System.out.println(str.charAt(i));
        }


        //indexOf
        String name = "naman";
        System.out.println(name.indexOf("n"));

        //compareTO()
        System.out.println(str.compareTo(name));
        System.out.println(name.compareTo(str));


        sc.close();

    }
}
