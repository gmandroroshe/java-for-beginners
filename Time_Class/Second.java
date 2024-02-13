package Time_Class;

public class Second { 

    private int hous;
    private int minute;
    private int second; 

    public void settime(int h, int m, int s){

        hous = ((h >= 0 && h <24) ? h:0  );
        minute = ((m >= 0 && m <60) ? m:0  ); 
        second = ((s >= 0 && s <60) ? s:0  );  
    }

    public String standedtime () {
        return String.format("%02d:%02d:%02d", hous,minute,second);

    }
    public String RegularTime(){
        return String.format("%d:%02d %s", ((hous == 0 || hous ==12) ? 12: hous%12  ),minute,second, (hous<12 ? "AM" : "PM") );
    }
    
}
