package Projects;

import java.util.Scanner;

public class TheGuessingGame {

	

	public static void main(String[] args) 
	{
		
		Scanner cin = new Scanner(System.in);
		
		int use = cin.nextInt();
		
		boolean notCod=true;
		
		System.out.println("Im thinking of a number between 1 and " +use+ ".");
		
		int random = (int)(1+use*Math.random());
		
		while(notCod==true)
		{
		
		int can1 = cin.nextInt();
		
	if(can1<random)
	{
		
		System.out.println("Too low!");
				
	}
	else if(can1==random)
	{
		
		System.out.print("You win!");
		notCod=false;
		
	}
	else
	{
		
		System.out.println("Too high!");
		
	}
	cin.close();
	}
}
}
