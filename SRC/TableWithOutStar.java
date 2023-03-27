import java.util.Scanner;
class TableWithOutStar{
	public static void main(String[] args){
		int product=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Multiplicant:");
		int Multiplicant=sc.nextInt();
		System.out.println("enter Multiplier:");
		int Multiplier=sc.nextInt();
		for(int i=0;i<Multiplier;i++){
			product += Multiplicant;
			System.out.println(i+1+". "+ Multiplicant + " X " + (i+1) + " = " + product);
			
}
}
}