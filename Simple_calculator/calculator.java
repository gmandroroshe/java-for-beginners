//program date 2024.01.29 kavindu Maduranga


package Simple_calculator;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

         double num1,num2,ans;

         System.out.print("Enter your First Number: ");
         num1 = numbers.nextDouble();

         System.out.print("Enter your Second Number: ");
         num2 = numbers.nextDouble();

         ans = num1 + num2 ;

         System.out.println("Your Anser is : " + ans);
         
        
         


    }
}
