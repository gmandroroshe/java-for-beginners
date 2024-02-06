package arguments;

public class arguments3 {
    public static void main(String[] args) {

        int num [] = {10,20,30,40,50};
        System.out.println(firstmeth(num));
    }
    public static int firstmeth (int x []){
        int sum = 0;

        for (int y:x){
            sum += y;  
        }
        return sum;  
    }
    
}
