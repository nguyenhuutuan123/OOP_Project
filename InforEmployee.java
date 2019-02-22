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
public class InforEmployee {
    
    protected String  name ;
      
    Scanner scanner = new Scanner (System.in);
    
    public void setName(String name){
        this.name= name;
    }
    
    public String getName(){
        return name;
    }
    
    public InforEmployee(){}
    
    public InforEmployee(String name){
        this.name= name;
    }
    
    public void enterName(){
        System.out.print("\t\tEnter employee's name : ");
        name = scanner.nextLine();
        
    }
    
      
    
    public void CheckName(){
        
        InforEmployee nv = new InforEmployee();
        nv.setName(name);  
        String [] a = nv.getName ().split("\\s");  // cat chuoi vua nhap
        
        for (int i = 0; i < a.length-1; i++) {
            if (i == 0)
            {
                System.out.print("\t\tLast name is :" + a[i].toUpperCase()  );
            }  
            
        }
        
        System.out.print("\n\t\tMiddle name is :");
        for (int i = 1; i < a.length - 1; i++) {  
            System.out.print(a[i].toUpperCase());
        }
        
        for (int i = a.length-1; i < a.length; i++) {
            System.out.println("\n\t\tFirst name is :" + a[i].toUpperCase());
        }
        
        String full = name.toUpperCase();
        System.out.println("\t\tYour full name is : " + full);
    }

} 
    

