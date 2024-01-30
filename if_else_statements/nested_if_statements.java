//programe date 2024.01.29

package if_else_statements;

public class nested_if_statements {

    public static void main(String[] args) {
        int age = 15 ; 

        if (age>18)
        {
            System.out.println("You can ");
        }
        else
        {
            System.out.println("You can't");

            if (age>14) {
                System.out.println("This is for you");
            }
            else
            {
                System.out.println("Sorry bro");
            }
        }
    }
    
}
