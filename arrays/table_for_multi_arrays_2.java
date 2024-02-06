package arrays;

public class table_for_multi_arrays_2 {
    public static void main(String[] args) {
        
        int numbers1 [][] = {{10,20,30,40},{50,60,70,80}};
        int numbers2 [][] = {{10,20,30,40},{50,60,70,80}};
        System.out.println("Dispaly number1 values");
        data_Display(numbers1);
        System.out.println("Dispaly number2 values"); 
        data_Display(numbers2); 


    }
    public static void data_Display(int x [][]){
        for (int row= 0 ; row < x.length; row++){
            for(int colum = 0; colum<x[row].length; colum++ ){
                System.out.print(x[row][colum] + "\t");


            }
            System.out.println("");  
        }
    }
    
}
