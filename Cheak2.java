//Program date 2024.02.13

import java.util.Scanner;

public class Cheak2 {

    public static void main(String[] args) {
        
        Scanner inputs = new Scanner(System.in);

        System.out.print("Enter Your Email: ");

        String email = inputs.next();

        System.out.print("Enter Your Password: "); 

        String password = inputs.next();


        if(email == "kavindu@gamil.com" && password == "Kavi2004"){
            System.out.println("You can login the account");   
        }
        else{
            System.out.print("Your Email or Password worng!"); 
        }

        
    } 
    
}
