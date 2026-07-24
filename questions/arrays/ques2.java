package questions.arrays;

public class ques2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for( int i = 0 ; i< arr.length; i++){
            sum += arr[i];
        }

        float avg = (float)sum/arr.length;

        int count = 0;
        for( int i = 0 ; i< arr.length; i++){
            if((int)avg > arr[i]){
                count++;
            }
        }

        System.out.println(count);
    }

}
