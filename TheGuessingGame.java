package Projects;

import java.util.Scanner;

public class TheGuessingGame 
{

	

	public static void main(String[] args) 
	
	{
		Scanner cin = new Scanner(System.in);
		
		int ben=1;	//Ben is used later on to loop
		
		while(ben==1)
			
			
		{			
		
			System.out.println("Pick a number between negative infinity and infinity.");
			
			int use = cin.nextInt(); //Given upper bound number
				
			boolean notCod=true;
		
			System.out.println("Im thinking of a number between 1 and " +use+ ".");
		
			int random = (int)(1+use*Math.random());	//Random number generator between 1 and given value
		
			while(notCod==true)	//Check later in code for notCod explanation
			{
		
				int can1 = cin.nextInt();	//Users guess
		
				if(can1<random)
				{
		
					System.out.println("Too low!");
				
				}
				else if(can1==random)
				{
		
					System.out.print("You win!");
		
					notCod=false;	//It will keep looping the guessing until they get it right then will move on
		
				}
				else
				{
		
					System.out.println("Too high!");
		
				}
			}
		
			System.out.println("");
		
			System.out.println("Would you like to play again?");
		
			System.out.println("1 for yes, 0 for no");
		
			ben = cin.nextInt();	//ben is the value that determines if the whole code will be repeated
		
			if(ben==0)
			{
			
				System.out.println("OK hope you enjoyed the game!");
			
			}
			
		}
		
		cin.close();
	}
		
}