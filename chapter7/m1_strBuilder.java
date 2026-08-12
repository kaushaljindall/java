package chapter7;
import java.util.*;
public class m1_strBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.append(" World");
        
        
        str.setCharAt(0, 'm');
        System.out.println(str);

        str.reverse();

        System.out.println(str);
    }

}
