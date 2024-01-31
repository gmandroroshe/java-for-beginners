package constructors ;

public class firstclass {
    public static void main(String[] args) {
        second_class object = new second_class("Kavindu");
        second_class object2 = new second_class("Maduranga");
        //   object.name("Kavindu");
        object.say();  
        object2.say();   
    }
}
