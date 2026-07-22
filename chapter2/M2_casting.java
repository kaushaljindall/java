package chapter2;

public class M2_casting {
    public static void main(String[] args) {
        // Implicit COnversion --> destination var should be have more width than source var 
        
        
        // (byte to int)
        byte i = 10; 
        int x; 
        x = i ;


        // (Char to int )
        char c = 'a';
        int e;
        e = c;


        System.out.println(x);
        System.out.println(e);


        //explicit Convertion

        int b = 24;
        byte t; 
        t = (byte)b;
        System.out.println(t);



        // CRAZY CASE 
        int r = 300;  
        byte m; 
        m = (byte)r;  
        System.out.println(m);
        //byte can store upto 8 bits (RANGE : -128 to 127)

        // Truncating Conversion 
        
        float f = 89.42f ;
        int u ;
        u = (int)f; // 89 

        System.out.println(u);

    }
}
