package chapter6;


public class m5_Strings {
    public static void main(String[] args) {
        String name = "Kaushal";
        String firstName = new String("Kaushal");

        System.out.println(name.equals(firstName));  // TRUE
        System.out.println(name == firstName);      // FALSE due to different address 
    }
}
 