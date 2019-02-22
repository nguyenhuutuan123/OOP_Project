
package javaproject;
import java.util.Scanner;




public class Score {
    
    protected int number;
    protected float sum =0;
    protected float average =0;
    protected float [] score ;
    protected float [] coefficient;
    
    Scanner scanner = new Scanner(System.in);

       
    public  Score (){
         
    }
     
     
    public void enterscore(){
        score = new float[number];
        coefficient = new float[number];
        
        for(int i=0;i<number;i++){
            do
            {
		System.out.print("Enter the score  "+(i+1) +"     :");
		score [i]= scanner.nextFloat();
                if(score[i]<0||score[i]>10){
                  System.out.println("The score is invalid , Pleace try again  ! ");  
                }
	    }while(score[i]<0||score[i]>10);
	    do
		{	
		System.out.print("Enter the coefficient "+(i+1) +":");
		coefficient [i]= scanner.nextFloat();
                if(coefficient[i]!=1&&coefficient[i]!=1.5&&coefficient[i]!=2&&coefficient[i]!=2.5&&coefficient[i]!=3){
                    System.out.println("The coefficient is invalid , Pleace try again ! ");  
                }
	    }while(coefficient[i]!=1&&coefficient[i]!=1.5&&coefficient[i]!=2&&coefficient[i]!=2.5&&coefficient[i]!=3);
        }
          
    }
    
    
    
    public void enternumber(){
        System.out.print("Enter the number of subjects  :");
	number = scanner.nextInt();
    }
   
    
    public void average(){
        for(int i=0;i<number;i++){
            sum= ( sum+ coefficient[i] );
            average += score[i] * coefficient[i];
        }
    }
   
    public void print(){
        float t =  (average/sum);
        System.out.println("\t========================================== ");
        System.out.println("\t     Your result is : ");
        System.out.println("\t     Total subjects are : "+ number);
        System.out.println("\t     Total coefficient are: "+ sum);
	System.out.println("\t     Your average is  : "+ t);
        if(t>=5){
            System.out.println("\n\t     You are very good !");
        }else{
            System.out.println("\t     You need try your best ! ");
        }
        System.out.println("\n\t=============== GOOD LUCK ===============");
        
    }
    
   /* public static void main(String [] args){

        Score TD = new Score();
        //TD.EnterInformation();
        TD.enternumber();
        TD.enterscore();
        TD.average();
        TD.print();
    } 
    */
   
      
}
