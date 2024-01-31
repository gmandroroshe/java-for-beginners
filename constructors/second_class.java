package constructors ;

public class second_class {
    
    private String firstname; // instances variable
    
    public second_class (String name){ // this method name using in class name //this is a constructors 
        firstname = name; 
    }
    
    /* 
    
    public void name (String name){

        firstname = name; 

    }
    */

    public String setname(){
        return firstname;
    }
    public void say(){
        System.out.println("hello I'm " + setname());   
    }
}
