package chapter9;
import java.util.*;


import java.util.Scanner;

public class m2_customExpection {
   public static void main(String[] args)  {
     Scanner sc=  new Scanner(System.in);
    int age = sc.nextInt();
try{
    if(age> 100){
        throw new myExpection("Doing something Wrong");
    }
}catch(myExpection e){
    System.out.println(e.getMessage());
}
    sc.close();
   }
}

class myExpection extends Exception{
     public myExpection(String Message){
        super(Message);
     }
}
