import java.lang.Math;
class SnakeAndLadder
{
	public static void main(String[] args)
	{
		int User=0;
		int start=1;
		int stop=6;
		while(User<=100)
		{
			double D1=(int)(Math.random()*(stop-start)+start);
			double D2=(int)(Math.random()*(stop-start)+start);
			int Dice= (int)(D1+D2);
			if((User+Dice)<=100){
			User= User+Dice;
			System.out.println((User-Dice)+" + "+Dice +" = "+User);
			
			switch(User)
			{
				case 17: User=7;System.out.println("Snake bite- New User = "+User);
					continue;
				case 54: User=34;System.out.println("Snake bite- New User = "+User);
					continue;
				case 62: User=19;System.out.println("Snake bite- New User = "+User);
					continue;
				case 64: User=60;System.out.println("Snake bite- New User = "+User);
					continue;
				case 87: User=36;System.out.println("Snake bite- New User = "+User);
					continue;
				case 92: User=73;System.out.println("Snake bite- New User = "+User);
					continue;
				case 95: User=75;System.out.println("Snake bite- New User = "+User);
					continue;
				case 98: User=79;System.out.println("Snake bite- New User = "+User);
					continue;
				case 1: User=38;System.out.println("Reached Ladder- New User = "+User);
					continue;
				case 4: User=14;System.out.println("Reached Ladder- New User = "+User);
					continue;
				case 9: User=31;System.out.println("Reached Ladder- New User = "+User);
					continue;
				case 21: User=42;System.out.println("Reached Ladder- New User = "+User);
					continue;
				case 28: User=84;System.out.println("Reached Ladder- New User = "+User);
					continue;
				case 51: User=67;System.out.println("Reached Ladder- New User = "+User);
					continue;
				case 72: User=91;System.out.println("Reached Ladder- New User = "+User);
					continue;
				case 80: User=99;System.out.println("Reached Ladder- New User = "+User);
					continue;
				case 100: System.out.println("********........Congractulations........*********YOU WON*******");
				default:break;
			}
			}
					if(User==100 || User==99)break;
		}
		
	}
}