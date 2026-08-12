package chapter5.questions;
import java.util.*;

class Product{
    int pID;
    String pName;
    int Price;
    int Quanity;

    Product(int id, String name, int pr, int qua){
        pID = id;
        pName = name;
        Price = pr;
        Quanity = qua;
    }

    void printing(){
        System.out.println("Product ID : " + pID);
        System.out.println("Product Name : " + pName);
        System.out.println("Price : " + Price);
        System.out.println("Quantity "+ Quanity);
        int total = Price * Quanity;
        System.out.println("Total : " + total);
        System.out.println();

    }

    int getTotal(){
        return Price* Quanity;
    }
}

public class ques1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int grandTotal = 0;

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            int price = sc.nextInt();
            int quantity = sc.nextInt();

            Product ob = new Product(id, name, price, quantity);

            ob.printing();
            grandTotal += ob.getTotal();
        }
        System.out.println("------------");

        System.out.println("Grand Total : " + grandTotal);

        sc.close();
    }
}