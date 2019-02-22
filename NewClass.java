package javaproject;

import java.util.Scanner;

public class NewClass 
{
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    float math;
    float english;
    float java;
    
    
    
    void nhap()
    {
        System.out.println("Enter Student's Name: ");
        name = scanner.nextLine();
        System.out.println("Enter Student's Age: ");
        age = scanner.nextInt();
        System.out.println("Maths:");
        math = scanner.nextFloat();
        System.out.println("English:");
        english = scanner.nextFloat();
        System.out.println("Java:");
        java = scanner.nextFloat();
    }
    
    float diemTb(float math, float english, float java  )
    {
        float dtb = (math+english+java)/3;
        return dtb;
    }
    
    void xuat()
    {
        System.out.println("Student's Name: " +name);
        System.out.println("Student's Age: " +age);
        System.out.println("Average Mark: " + diemTb( math,english,  java  ));
    }
    
    
    
    
    public static void main(String args[])
    {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Nhap so luong sinh vien");
        int n= scanner.nextInt();
        NewClass [] SV1 = new NewClass[n];
        for(int i= 0; i<n;i++){
            SV1[i]= new NewClass();
            SV1[i].nhap();
        }
        for(int i= 0; i<n;i++){
            SV1[i].xuat();
        }
        
        
        
    }
    
    
    
    
    
    
    
}
