package Random_number_generator;

import java.util.Random;

public class Randomnumber{ 
    public static void main(String[] args) {

        Random number = new Random();

        int num;

        for (int i=0; i<5; i++){
            num = number.nextInt(5);  
            System.out.println(num); 
        }
    }
}

