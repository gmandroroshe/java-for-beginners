package arrays;

public class table_for_multi_arrays_1 {
    public static void main(String[] args) {
        
        int numbers2 [][] = {{10,20,30,40},{50},{60,70,80,90}};

        for (int row= 0 ; row < numbers2.length; row++){
            for(int colum = 0; colum<numbers2[row].length; colum++ ){
                System.out.print(numbers2[row][colum] + "\t");


            }
            System.out.println("");  

        }
    }
    
}
