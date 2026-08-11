package chapter6.stringsQues;

public class ques2 {
    public static void main(String[] args) {
        String name = "abcd";

        for (int i = 0 ; i <= name.length()-1;i++ ){
            for(int j = i+1 ; j <= name.length();j++){
                
            
            System.out.print(name.substring(i, j)+ " ");
                  
            }
            // a ab abc abcd b bc bcd c cd d 
        }
    }
}
