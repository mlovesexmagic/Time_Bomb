/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhipeng (Adrian) Mei
 */
public class PracticeProgramClock {

    private int hours;
    private int mins;
    private int minToAdvClock;
    
    public PracticeProgramClock(){
        hours = 0;
        mins = 0;
        minToAdvClock = 0;
    }
    
    //getting hours and minutes from user's input
    public PracticeProgramClock(int hrs, int min){
        hours = hrs;
        mins = min;
               
        if(mins >= 60){
            while(mins - 60 >= 0) {
                mins = mins - 60;
            }
        hours++;
        }
    }
    
    //adding additional minutes, convert total minutes to hours
    public int addMinute(int minToAdv){
        minToAdvClock = minToAdv;
        mins = this.mins + minToAdvClock;
        
        if(mins >= 60){
            while(mins - 60 >= 0) {
                mins = mins - 60;
            }
        hours++;
        }
        return mins;
    }
    
    public void setMin(int mins){
        this.mins = mins;
    }
    
    public void setHr(int hours){
        this.hours = hours;
    }
    
    public void setMinToAdv(int minToAdv){
        this.minToAdvClock = minToAdv;
    }
    
    //getting the minute
    public int getMin(){
        return mins;
    }
    
    //getting the hours
    public int getHrs() {
        return hours;
    }
    
    //getting the second
    public int getMinToAdvClock() {
        return minToAdvClock;
    }
    
    public void printTime(){
        System.out.println(hours + ":" + mins);
    }
}