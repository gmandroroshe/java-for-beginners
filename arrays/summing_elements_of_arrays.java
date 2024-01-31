package arrays;

public class summing_elements_of_arrays {
    public static void main(String[] args) {
        
        int numbers [] = {10,20,30,40};

        int sum = 0 ; 

        for(int count = 0 ; count<numbers.length; ++count){

            sum += numbers [count];

        }

        System.out.println(sum);
        


    }
    
}
