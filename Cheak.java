import java.util.Scanner;

public class Cheak {
    public static void main (String[] args)
	{
        Scanner read1 = new Scanner(System.in);
        System.out.print("Enter what you wont max or min : ");

        String value = read1.next(); 

        if ( value == "max"){
                max();
        }
        else if (value == "min"){
            min();

        }
        else {
            System.out.println("Invalid value"); 
        }


        
	}

    public static void max (){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter First Number : ");
        int number1 = read.nextInt();
        System.out.print("Enter Second Number : "); 
        int number2 = read.nextInt();

        int output = number1 + number2;
        
        System.out.println("Output is : " + output);  
        
    }
    public static void min (){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter First Number : ");
        int number1 = read.nextInt();
        System.out.print("Enter Second Number : "); 
        int number2 = read.nextInt();

        int output = number1 - number2;
        
        System.out.println("Output is : " + output);   
        
    }

    
}
        
        

    
    

