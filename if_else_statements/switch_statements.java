//programe date 2024.01.29

package if_else_statements;

public class switch_statements {
    public static void main(String[] args) {
        
        int age = 20 ;

        switch (age) {
            case 20:
                System.out.println("You are 20 years old ");
                break;
            case 19:
                System.out.println("You are 19 years old");
                break; 
            case 18:
                System.out.println("You are 18 years old");  
                break;      
        
            default:
            System.out.println("You are kid");
                break;
        }
    }
    
}
