
package javaproject;
import java.util.Hashtable;
import java.util.Scanner;

public class Calendar {
    private int month;
    private int year;
    Scanner scanner = new Scanner(System.in);
    
    
    
    public Calendar(int month){
        this.month=month;
    }

    public Calendar() {
        this.month= month;
    }
    
    public void setMonth(int month){
        if(month<0||month>12){
            this.month=0;
            
        }else{
            this.month=month;
        }
    }
    
    public int getMonth(){
        return month;
    }
    
    public void setYear(int year){
        if(year<0){
            this.year=0;
        }else{
            this.year=year;
        }
    }
    
    public String getYear(){
        if(year%4==0){
        return  "\t\tLeap year\n\t\tMonth has 29 days" ;
        }else{
        return "\t\tNot leap year\n\t\tMonth has 28 days";
        }
    }
    
   
    
    public void check(){
	switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		System.out.println("\t\tMonth has 31 days ");
                System.out.println("\n\t=============== GOOD LUCK =======================");
		break;	
		case 4: case 6: case 9: case 11:
                System.out.println("\t\tMonth has 30 days");
                System.out.println("\n\t=============== GOOD LUCK =======================");
		break;
                case 2 :
                    System.out.print("\t\tEnter year:");
                    year=scanner.nextInt();
                    System.out.println( getYear() );
                    System.out.println("\n\t=============== GOOD LUCK =======================");
                default:
                    System.out.println(" \n");
                    break;	
	}
    }
    
    
    
    public void enterMonth(){
        do{
            System.out.println("\t=================================================");
            System.out.print("\t\tEnter month  : ");
            month = scanner.nextInt();
            if(month<=0||month>12){
                System.out.println("\tYour choose is invalid, Pleace try again ! ");
            }
        }while(month<0||month>12);
        
    }
    
    public void month(){
         System.out.println("\t* Your result is : \n");
         System.out.println("\t================================================== ");
         
         System.out.println("\t\tJanuary   : 31 days ");
         System.out.println("\t\tFebuary   :  Leap year     :  29 days ");
         System.out.println("\t\t          :  Not leap year :  28 days ");
         System.out.println("\t\tMarch     : 31 days ");
         System.out.println("\t\tApple     : 30 days ");
         System.out.println("\t\tMay       : 31 days ");
         System.out.println("\t\tJun       : 30 days ");
         System.out.println("\t\tJuly      : 31 days ");
         System.out.println("\t\tAugust    : 31 days ");
         System.out.println("\t\tSeptember : 30 days ");
         System.out.println("\t\tActober   : 31 days ");
         System.out.println("\t\tNovember  : 30 days ");
         System.out.println("\t\tDecember  : 31 days ");
         System.out.println("\n\t=============== GOOD LUCK =======================");
    }

    
   
    
}
