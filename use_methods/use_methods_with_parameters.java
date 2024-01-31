package use_methods;

public class use_methods_with_parameters {

    public static void main(String[] args) {
        use_methods_with_parameters object = new use_methods_with_parameters();
        object.firstmethod("Kavindu"); //put value for argument
        object.secondmethod(19); //put value for argument
    }

    public  void firstmethod (String name){  //create a argument

        System.out.println(name);

    }

    public void secondmethod(int age){  //create a argument
        
        System.out.println(age);
    }
    
}
