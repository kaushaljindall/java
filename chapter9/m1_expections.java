package chapter9;

public class m1_expections {

    public static void main(String[] args) {

        int[] a = new int[5];

        try {
            System.out.println(a[8]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not valid index " + e);
        }
        finally{
            System.out.println("Hello Guys");
        }

        
    }
}