package questions.arrays;
import java.util.*;

public class ques8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] seats = new int[5][4];
    
        for(int i = 0 ; i< 5; i++){
            for(int j =0 ; j < 4; j++){
                seats[i][j] = 0;
            }
        }

        int n = sc.nextInt();

        for(int i = 0; i<n ; i++){
            
            int row = sc.nextInt();
            int col = sc.nextInt();

            seats[row-1][col-1] = 1;

        }

        for(int i = 0 ; i< 5; i++){
            for(int j = 0; j <4; j++){
                System.out.print(seats[i][j]+ " ");

            }
            System.out.println();
        }

        System.out.println("Reserved Seaes = " + n);
        System.out.println("Avaiable Seaes = " + (5*4 - n) );
    }
}
