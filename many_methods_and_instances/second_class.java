package many_methods_and_instances;

public class second_class {
    
    private String firstname; // instances variable
    public void name (String name){

        firstname = name; 

    }
    public String setname(){
        return firstname;
    }
    public void say(){
        System.out.println("hello I'm " + setname());   
    }
}
