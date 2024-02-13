package Public_and_Private;

public class orange {

    public int hour;
    public int minute;
    public int second; 


    public orange (int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }
    public void Show(){
        System.out.printf("%2d,%2d,%2d",hour,minute,second);
    }
}


