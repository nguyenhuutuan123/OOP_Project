/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.util.Scanner;

/**
 *
 * @author tuan.nguyen1
 */
public class Salary {
    private float hour ;
    private float salary;
    
    
    Scanner scanner = new Scanner(System.in);
    
    public Salary (){}
    
    public Salary (float hour, float salary){
        this.hour=hour;
        this.salary=salary;
    }
    
    public void setHour(float hour){
        this.hour=hour;
    }
    
    public float getHour(){
        return hour;           
    }
    
    public void setSalary(float salary){
        this.salary = salary ;
    }
    
    public float getSalary(){
        return salary;
    }
    
    public float  payroll(float salary,float hour)
    {
	float s;
	if(hour<=40){
            s=salary*hour;	
	}else{
            s = (float) ((float) salary*(hour-40)*1.5+salary*40);	
	}
        return s;
    }

   
    
    public void enter(){
        System.out.print("\t\tEnter your hour : ");
        do{
            hour = scanner.nextFloat();
            if(hour <1){
                System.out.print("\t\tYour choose is invalid, Pleace try again :");
            }
        }while(hour <1);
        
        System.out.print("\t\tEnter your salary : ");
        do{
            salary = scanner.nextFloat();
            if(salary <1){
                System.out.print("\t\tYour choose is invalid, Pleace try again :");
            }
        }while(salary <1);
        
        
        
         
    }
    
    public void print(){
        System.out.println("\n\t\tHours is : " +  hour + ",  Salary is : " + salary);
        System.out.println("\t\tThe total salary of the employee is : " +  payroll(salary, hour));
    }
    
 
}

 