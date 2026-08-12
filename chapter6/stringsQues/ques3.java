package chapter6.stringsQues;

import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();

        StringBuilder ip = new StringBuilder(input);
        for(int i = 0 ; i< ip.length()-1 ; i++){
            if(ip.charAt(i)>= 'A' && ip.charAt(i)<= 'Z'){
                ip.setCharAt(i, (char)(ip.charAt(i)+32));
            }
            else if(ip.charAt(i)>= 'a' && ip.charAt(i)<= 'z'){
                ip.setCharAt(i, (char)(ip.charAt(i)-32));
            }
        }

        System.out.println(ip);

        sc.close();
    }
}
