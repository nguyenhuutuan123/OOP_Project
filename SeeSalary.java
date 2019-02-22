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
public class SeeSalary {
    Scanner scanner = new Scanner(System.in);
     
    private float salary;
    
    public SeeSalary(){}
    
    public SeeSalary(float salary){
        this.salary=salary;
    }
   
    public void setSalary(float salary){
        this.salary=salary;
    }
      
    public float getSalary(){
        
            return salary;
        
    }
    
    public void print(){
        System.out.println("\t\t"+getSalary());
    }
    
    public void enterSalary(){
        
        System.out.print("\t\tEnter employee's salary  : ");
        do{
            salary = scanner.nextFloat();
            if(salary<0){
                System.out.print("\t\tThe salary is invalid , pleace try again  :");
            }
        }while(salary<0);
        
    }   
    
    
    public static void SortSalary(SeeSalary [] nhanvien )
    {
        SeeSalary tam = new SeeSalary();
        for (int i = 0; i< nhanvien.length; i++)
        {
            for (int j = i+1; j<nhanvien.length; j++)
            {
                if(nhanvien[i].getSalary()>nhanvien[j].getSalary())
                {                          
                   tam = nhanvien[i];
                   nhanvien[i]= nhanvien[j];
                   nhanvien[j]=tam; 
                }
              
            }
        }
	
	
    }
    
    public void display(){
        System.out.print("\t\tEnter employees's number  : ");
        int n = scanner.nextInt();
        SeeSalary [] nhanvien = new SeeSalary[n];
                
        for (int i=0;i< nhanvien.length; i++ )
        {
            nhanvien[i]=new SeeSalary();
            nhanvien[i].enterSalary();
        }
        System.out.println("\n\n\t* Your result is : \n\n\t==========================================================");
        System.out.println("\t* The number of employee is :"+ nhanvien.length);
        System.out.println("\t* Employees's salary were enter :");
        for (int i=0;i< nhanvien.length; i++ )
        {
             nhanvien[i].print();
        }
        System.out.println("\t* Employees's salary after sort is :");
        SortSalary(nhanvien);
        for (int i=0;i< nhanvien.length; i++ )
        {
            nhanvien[i].print();
        }
        
    }
    
   
}


