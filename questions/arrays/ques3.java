package questions.arrays;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for( int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        boolean sort = true;
int max = arr[0];

for (int i = 1; i < n; i++) {
    if (arr[i] < max) {
        sort = false;
        break;
    }
    max = arr[i];
}

System.out.println(sort);

        sc.close();
    }
}
