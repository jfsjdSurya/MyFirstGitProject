import  java.util.Scanner;
calss NextEven{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
		int N = sc.nextInt();
		int sum=0;
		if(N>0){
			for(int i=1;i<N;i++){
				if(N%i == 0){
					sum= sum+1;
				}
			}
			if(N%2==0 && sum==1){
				System.out.println("The next even number is "+(N+2));
			}
			else if(N%2 != 0 && sum==1){
				System.out.println("The next even number is "+(N+1));
			}
		}
    }
}