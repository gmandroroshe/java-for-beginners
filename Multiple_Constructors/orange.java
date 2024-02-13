package Multiple_Constructors;

public class orange {

    private int hour;
    private int minute;
    private int second; 

    
    public orange (int h){
        this(h,0,0); 
    }
    public orange (int h,int m){
        this(h,m,0);
    }
    public orange (int h, int m, int s){
        sethour(h);
        sethour(m);
        sethour(s);
    }

    public void sethour(int h){
        hour = (h>=0 && h<24) ? h : 0 ; 
    }
    public void setmint(int m){
        hour = (m>=0 && m<60) ? m : 0 ; 
    }
    public void setsecond(int s){
        hour = (s>=0 && s<60) ? s : 0 ;  
    }
    public int gethour(){
        return hour;
    }
    public int getmint(){
        return hour;
    }
    public int getsecond(){
        return hour; 
    }

    public String Display (){
        return String.format("%2d,%2d,%2d",gethour(),getmint(),getsecond(), hour,minute,second);

    }
    
}
