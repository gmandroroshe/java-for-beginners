package tostring;

public class therd {
    
    private int year; 
    private int month; 
    private int day;

    //this is constructor
    public therd  (int y, int m, int d){

        year = y;
        month = m;
        day = d;

        System.out.printf("My birthday is %s \n",this);
    }

    public String toString(){
        return String.format("%d,%d,%d", year,month,day); 
    }
}
