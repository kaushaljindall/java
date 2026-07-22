package chapter3;

public class M3_shiftOperators {
    public static void main(String[] args) {
        byte b = 8;
        b = (byte)(b << 1); // 16 
        b = (byte)(b << 2); // 16*(2^2)
        System.out.println(b);  //64

        b = (byte)(b << 1); // MSB = 1 --> -ve Number 
        // b = -128

        System.out.println(b);  //-128
    }
}
