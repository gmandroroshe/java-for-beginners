package use_methods;

import java.util.Scanner; 

public class create_calculator_using_method {

    public static void main(String[] args) {

        getsum();
        getmaines(); 
        Scanner numbers = new Scanner(System.in); 
        int num1 , num2 , sum, maines, Operator; 

        System.out.print("Enter your First Number: "); 
        num1 = numbers.nextInt(); 

        System.out.println("Enter Operator \n + for 1 \n - for 2 : ");
        Operator = numbers.nextInt(); 

        System.out.print("Enter your second Number: ");
        num2 = numbers.nextShort(); 

        sum = num1 + num2 ;

        maines = num1 - num2 ; 


        
    }

    public static void getsum (){

        if( Operator == 1 ){

            System.out.println("Your ansowr is : " + sum); 
        } 

    }
    public static void getmaines(){

    }
    
}
