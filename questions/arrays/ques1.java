package questions.arrays;

public class ques1 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 9, 4, 2};
    
        int max = arr[0];
        int min = arr[0];
        int maxIdx = 0;
        int minIdx = 0;


        for( int i = 0; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIdx = i;
            }
            
            
            if(min > arr[i]){
                min = arr[i];
                minIdx = i;
            }
        }

        System.out.println("Maximum Number " + max +" at Index " + maxIdx);
        System.out.println("Maximum Number " + min + " at Index " + minIdx);

    }
}
