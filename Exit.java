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
public class Exit {
    public int  chon;
    Scanner scanner = new Scanner (System.in);
    
    public void exit (){
       
        
        System.out.println("Do you want to exit this program ?  ");
        System.out.println("1  : Go Back ");
        System.out.println("2  : Exit  ");
        
            System.out.println("Enter your choice  : ");
             chon = scanner.nextInt();
        
        switch(chon){
            case 1:
               
            TestProject OOP = new TestProject();
            OOP.menu();
            OOP.test();
            case 2:
            System.out.println("\t--------------------------------------------------------");
            System.out.println("\t===========  Thanks for using this program    =========== ");
            System.out.println("\t--------------------------------------------------------\n\n\n");
            System.exit(0);
        }
        }
        
    }
   






    
    
