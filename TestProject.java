/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.awt.EventQueue;
import java.util.Scanner;
import static javaproject.SeeSalary.SortSalary;

public class TestProject {
    int number,choose;
    int chooser;
    Scanner scanner = new Scanner(System.in);
    
    public void menu()
    {

	System.out.println("\t\t ___________________________________________\t\t\n");
	System.out.println("\t\t    ************************************    ");
	System.out.println("\t\t    *** INTELLEGENT LEARNING PROGRAM ***     ");
	System.out.println("\t\t    ************************************     ");
	System.out.println("\t\t ___________________________________________\n");
	System.out.println("\t===========================MENU============================\n");
	System.out.println("  Pleace enter your choice : ");
	System.out.println("   1. CALENDAR ");
	System.out.println("   2. CALCULATE SALARY ");
	System.out.println("   3. SEE SALARY");
	System.out.println("   4. INFORMATION OF EMPLOYEE");
	System.out.println("   5. SCORE AVERAGE OF STUDENT ");
	System.out.println("   6. EXIT PROGRAM \n");
	
        System.out.print("Pleace enter number from 1 to 6  :  ");
        do{
            number= scanner.nextInt();
            if(number<=0||number>6){
               System.out.println("Your choose is invalid, Pleace try again !"); 
            }
        }while(number<=0||number>6);
	
    }
    
    
    public void yourchoose(){
        
        System.out.println("Do you want to see dafault or enter information ?");
        System.out.println("\t1. Default information ");
        System.out.println("\t2. Enter Information"); 
        do{
            chooser= scanner.nextInt();
            
            if(chooser <1||choose>2){
                System.out.println("Your choose is invalid, Pleace try again !");
            }
        }while(chooser <1||chooser>2);
    }        
    
    
    
    
    
    public void test(){
        
        switch(number)
	{
            case 1:
                
		System.out.println("\n\t__________________   CLENDAR VIEW PROGRAM  ____________________\n");
                yourchoose();
                if(chooser ==1){
                    Calendar x = new Calendar();
                    x.month();
                }else{
                    Calendar x = new Calendar();
                    x. enterMonth();
                    x.check();
                }
                
                exit();
	    case 2:
	    	System.out.println("\n\t__________________  PROGRAM CALCULATE SALARY   ____________________\n");
                yourchoose();
                
                    switch(chooser){
                        case 1:
                            Salary [] s = new Salary[2];
                            s[0]= new Salary(8,3);
                            s[1]= new Salary(30,78);
                            System.out.println("\t==========================================================");
                            System.out.println("\t\tNumber of employees is : " + s.length);
                            s[0].print();
                            s[1].print();
                            break;
                        case 2:
                            System.out.print("\t\tNhap so nhan vien muon tinh luong :");
                            int n= scanner.nextInt();
                            Salary [] a= new Salary[n];
                            for(int i=0;i<a.length;i++){
                                a[i]= new Salary();
                                a[i].enter();
                            }
                            System.out.println("\n\n\t\t* Your result is : \n\n\t==========================================================");
                            System.out.println("\t\tNumber of employees is : " + a.length);
                            for(int i=0;i<a.length;i++){
                                a[i].print();
                            }
                            break;
                            
                    }
                    System.out.println("\n\t======================= GOOD LUCK ========================");
                exit();
            case 3:
		System.out.println("\n\t__________________  PROGRAM SEE SALARY OF EMPLOYEES  ____________________\n");
                yourchoose();
                if(chooser==1){
                    SeeSalary [] nhanvien = new SeeSalary[4];
                    nhanvien[0]= new SeeSalary(23);
                    nhanvien[1]= new SeeSalary(3);
                    nhanvien[2]=new SeeSalary(5);
                    nhanvien[3]=new SeeSalary (34);
                    System.out.println("\n\n\t* Your result is : \n\n\t==========================================================");
                    System.out.println("\t* The number of employee is   :"+ nhanvien.length);
                    System.out.println("\t* Employee salary after sort is :");
                    SortSalary(nhanvien);
                    for (int i=0;i< nhanvien.length; i++ )
                    {
                        nhanvien[i].print();
                    }
                    
                }else{
                    SeeSalary nhanvien= new SeeSalary();
                    
                    nhanvien.display();
                }
                System.out.println("\n\t======================= GOOD LUCK ========================");
               exit();
                
            case 4:
		System.out.println("\n\t__________________  INFORMATION OF EMPLOYEE  ____________________\n");
                InforEmployee n= new InforEmployee();
                n.enterName();
                //n.setName("Nguyen huu tuan");
                System.out.println("\n\n\t* Your result is : \n\n\t==========================================================");

                n.CheckName();
                System.out.println("\n\t======================= GOOD LUCK ========================");
		exit();  		
                
            case 5:
		System.out.println("\n\t__________________  SCORE AVERAGE OF STUDENT  ____________________\n");
                Score TD = new Score();
                //TD.EnterInformation();
                TD.enternumber();
                TD.enterscore();
                TD.average();
                TD.print();
                
                exit();
                
            case 6:
                //Exit exit = new Exit();
                exit();  
            }    
    }
    
    public void exit(){
        System.out.println("\n\tDo you want to exit this program  ? \n");
        System.out.println("\t1  : Go Back ");
        System.out.println("\t2  : Exit ");
        
            System.out.println("\tEnter your choose : ");
            do{
                choose = scanner.nextInt();
                if(choose <0||choose>2){
                    System.out.println("Your choose is invalid, Pleace try again !");
                }
            }while(choose <0||choose>2);
            
        
        switch(choose){
            case 1:
                menu();
                test();
            case 2:
                System.out.println("\t--------------------------------------------------------");
                System.out.println("\t===========  Thanks for using this program    =========== ");
                System.out.println("\t--------------------------------------------------------\n\n\n");
                System.exit(0);
            
            }
    }
    
    
    
    
        public static void main(String [] args){
            TestProject KT = new TestProject();
            KT.menu();
            KT.test();
        
    }

}





    

    

    

    

