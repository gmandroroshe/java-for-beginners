package arrays;

public class table_for_multi_arrays_3 {
    public static void main(String[] args) {
        int a [][] = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        int b [][] = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        System.out.println("Dispaly a");
        data_Display(a);
        System.out.println("Dispaly b");
        data_Display(b); 


    }
    public static void data_Display(int x [][]){
        for (int row= 0 ; row < x.length; row++){
            for(int colum = 0; colum<x[row].length; colum += 2 ){ 
                System.out.print(x[row][colum] + "\t");


            }
            System.out.println("");  
        }
    }
    
}
