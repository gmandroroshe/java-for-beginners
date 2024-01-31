package arrays;

public class enhanced_for_loops {

    public static void main(String[] args) {
        
        int numbers [] = {1,2,3,4,5};

        int sum = 0 ;

        for (int count: numbers ){

            sum += count;

        }

        System.out.println(sum); 
    }
    
}
