package Time_Class;

public class first {
    public static void main(String[] args) {
        
        Second object = new Second();

        System.out.println(object.standedtime());
        System.out.println(object.RegularTime() ); 

        
        object.settime(10, 20, 54); 
        System.out.println(object.standedtime());  
        System.out.println(object.RegularTime() );   
    }
    
}
