package chapter1;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        System.out.println(age);
        sc.nextLine();

        String name = sc.nextLine();
        System.out.println(name);

        float percentage = sc.nextFloat();
        System.out.println(percentage);

        sc.close();
    }
}
