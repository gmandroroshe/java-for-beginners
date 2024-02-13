package Public_and_Private;

public class apple {
    
    public static void main(String[] args) {
        
        orange object = new orange(5, 20, 10);
        object.Show(); 



        Public_V obj2 = new Public_V();
        obj2.number1 = 10;
        obj2.number2 = 11;
        obj2.number3 = 12;

        System.out.println("\n");  

        System.out.println(obj2.number1);  
        System.out.println(obj2.number2); 
        System.out.println(obj2.number3); 
    }
}
 