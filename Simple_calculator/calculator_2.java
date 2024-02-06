// programe date 2024.02.04
package Simple_calculator;

import java.util.Scanner; 

public class calculator_2 {
    public static void main(String[] args) {

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


    if( Operator == 1 ){

        System.out.println("Your ansowr is : " + sum); 
    } 
    else if(Operator == 2) { 

        System.out.println("Your ansowr is : " +maines); 
    }
    else{
        System.out.println("Invalid input"); 
    }
   
    }
    
}
