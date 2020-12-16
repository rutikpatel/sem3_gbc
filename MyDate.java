/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// Rutik Patel-101235165
// Harsh Patel-101243993
// Prishita Ribadia-101284685
package assignment2javafx;

/**
 *
 * @author rutikpatel
 */
public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public MyDate(){
        day =0;
        month=0;
        year =0;
    }
    
    public MyDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    public String getMonthShortForm()
    {
        switch (month)
        {
            case 1:
                return "Jan";
            case 2:
                return "Feb";
            case 3:
                return "Mar";
            case 4:
                return "Apr";
            case 5:
                return "May";
            case 6:
                return "Jun";
            case 7:
                return "July";
            case 8:
                return "Aug";
            case 9:
                return "Sep";
            case 10:
                return "Oct";
            case 11:
                return "Nov";
            case 12:
                return "Dec"; 
            default:
                return "-";
        }
    }
            
    public String getMonthLongForm()
    {
        switch (month)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December"; 
            default:
                return "-";
        }
    }
    
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    

        

   
    @Override
    public String toString() {
         String s;
        s = "Day: "+day+ 
            "\nMonth: "+month+
            "\nYear: "+year+
            "\nMonth in Short Form: "+getMonthShortForm()+
            "\nMonth in Long Form: "+getMonthLongForm();     
        return s;
    }
      
}
