package arguments;

public class variable_length_arguments {
    public static void main(String[] args) {
        secon_meth(1,2,3,4);
    }
    public static void secon_meth (int...numbers){


        int sum = 0; 

        for (int x:numbers){

            sum += x;  

        }


        int avarage = sum/numbers.length; 



        System.out.println(numbers[1]);  
        System.out.println(sum);    
        System.out.println(avarage);     

    }
    
}
