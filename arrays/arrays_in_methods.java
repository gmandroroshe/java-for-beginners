package arrays;

public class arrays_in_methods {

    public static void main(String[] args) {
        
        int numbers [] = {1,2,3,4};

        value(numbers);

        for (int y: numbers){
            System.out.println(y);
        }

    }
    public static void value (int x[]){
        for (int i = 0; i<x.length; i++){
            x[i] += 10; 
        }
    }
    
}
