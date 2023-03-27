import java.lang.Math;
import java.util.Scanner;
class GuessNum{
	public static void main(String[] args){
		int C_num;
		int U_num=0;
		C_num=(int)(Math.random()*100);
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++){
			System.out.println("Enter the Number: ");
			U_num= sc.nextInt();
			if(C_num == U_num){
				System.out.println("congratulations!! You guess it right.");
				break;
			}
			else if(C_num < U_num)
				System.out.println("too large. Try again.");
			else if(C_num > U_num)
				System.out.println("too short value.. try again.");
			else
				System.out.println("invalid");
		}
		if(U_num != C_num ){
			System.out.println("the number is "+C_num);
			System.out.println("time out. Better luck next time ");
		}
	}
}