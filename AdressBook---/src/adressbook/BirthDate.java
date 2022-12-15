/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adressbook ;

/**
 *
 * @author ansam
 */
public class BirthDate {
   private int day ; 
    private int month ; 
    private int year ;
    
    public BirthDate (int day , int month , int year) {
        this.day = day ;
        this.month = month ;
        this.year = year ;
    }
    public BirthDate () {
        this.day = 0 ;
        this.month = 0 ;
        this.year = 0 ;
    }
    public int getDay () {
        return day ;
    } 
    public int getMonth () {
        return month ;
    } 
    public int getYear () {
        return year ;
    } 
    public void setDay (int day) {
        if (day < 32 && day > 0)
            this.day = day ;
    }
    public void setMonth (int month) {
        if (month < 13 && month > 0)
            this.month = month ;
    }
    public void setYear (int year) {
        if (year < 2023 && year > 1900)
            this.year = year ;
    }
//    public String getDate () {
//        String strMonth = "" ;
//        switch (month) {
//            case 1 -> strMonth = "Jan" ;
//            case 2 -> strMonth = "Feb" ;
//            case 3 -> strMonth = "Mar" ;
//            case 4 -> strMonth = "Apr" ;
//            case 5 -> strMonth = "May" ;
//            case 6 -> strMonth = "Jun" ;
//            case 7 -> strMonth = "Jul" ;
//            case 8 -> strMonth = "Aug" ;
//            case 9 -> strMonth = "Sep" ;
//            case 10 -> strMonth = "Oct" ;
//            case 11 -> strMonth = "Nov" ;
//            case 12 -> strMonth = "Dec" ;
//        }
//        return (strMonth + " " + day + ',' + year) ;
//    }
   
    
    
  
    public String getAge (int currDay , int currMonth , int currYear) {
       int now = currDay + (currMonth * 30) + (currYear * 30 * 12) ;
       int birth = day + (month * 30) + (year * 30 * 12) ;
       int age = now - birth ;
       int ageYear = age / (12 * 30) ;
       age -= (ageYear * 12 * 30) ;
       int ageMonth = age / (30) ;
       age -= (ageMonth * 30) ;
       return (age + " Days , " + ageMonth + " Months , " + ageYear + " Years") ;
  }

    @Override
    public String toString() {
        return "BirthDate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }
    
    
}



 

