package ControlFLow;

import java.lang.Math;
import java.util.Scanner;
class Mindread{

	public static void main(String [] args)
	{
	 
	  int u_score=0;
	 int C_score=0;	
	  int start=0;
	  int stop=1;
	
	  int userNo, computerNo;
	  while(true)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your choice");
	  userNo=sc.nextInt();
	 computerNo=((int)(Math.random()*(stop-start+1)+start));
	System.out.println("computer choice------"+computerNo);
	

	if(userNo==computerNo)
	{ 	//C_score=C_score+1;
		C_score++;
		//C_score+=20;
                                    
		 System.out.println("Computer wins the game \n---------Best luck next time-----");
	}
  
	 else
	{
		u_score++;
	  System.out.println("*Conguratulation**\n you wins the game ");
	}
                       System.out.println("***Computer Score is  :" +C_score);
                           System.out.println("***User Score is :" +u_score);
	 }   //end of while
	}   // end of main method

}  //end of class