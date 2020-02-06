import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if(0<hour&& hour<23){
            this.hour = hour;
        }
    }
    public void setMinute(int minute) {
        if(0<=minute && minute <=59){
            this.minute = minute;
        }

    }
    public void setSecond(int second) {
        if(0<=second && second<=59){
            this.second = second;
        }
    }

    public void nextSecond(){
        if (second == 0){
            second = 1;
        }
        else if (second == 59 && minute == 59){
            second = 0;
            minute = 0;
            if (hour == 12){
                hour = 1;
            }
            else{
                hour++;
            }
        }
        else if (second == 59 && minute == 0){
            minute = 1;
        }
        else {
            second++;
        }

    }
    public void previousSecond(){
        if (second == 0 && minute == 0){
            second = 59;
            minute = 59;
            if (hour == 1){
                hour = 12;
            }
            else{
                hour--;
            }
        }
        else if(second == 0){
            second = 59;
            minute--;
        }

        else{
            second--;
        }
    }

    public String toString(){
        String strSecond = "";
        String strMinute = "";
        String strHour = "";
        //second
        if(second>=0 && second<=9){
            strSecond = "0"+second;
        }
        else{
            strSecond = ""+second;
        }
        //minute
        if(minute>=0 && minute<=9){
            strMinute = "0"+minute;
        }
        else{
            strMinute = ""+minute;
        }
        //hour
        if(hour>=0 && hour<=9){
            strHour = "0"+hour;
        }
        else{
            strHour = ""+hour;
        }
        return strHour+ ":"+ strMinute + ":"+ strSecond;
    }

    Time(int hour,int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
