package use_methods;

public class methods {
    public static void main(String[] args) {
        firstmethod();// you need to Call firstmethod
        //you can not call seconmethod becouse it's not static method
        methods object = new methods(); //you need to create object 
         object.secondmethod();// now you can call second method
    }

    public static void firstmethod(){
        System.out.println("First Method");
    }

    public void secondmethod (){
        System.out.println("Second Method");
    }
    
}
