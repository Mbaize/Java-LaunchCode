/**
	User: mbaize
	Date: 7/1/14
	Time: 1:36am
*/

import java.io.Console;

public class Mario {

	public static void main(String[] varArgs) {
		
		int rows;
		do{
			Console c = System.console();
			System.out.print("How many rows high would you like the pyramid to be? (The number must be between 0 and 23, inclusive.) ");
			rows = Integer.parseInt(System.console().readLine());
			//rows = c.readLine("How many rows high would you like the pyramid to be? (The number must be between 0 and 23, inclusive.) ");
		} while (rows < 0 || rows > 23);
		
		
		for (int i = 0; i < rows; i++)
		{
			
			for (int j = (rows - (i + 1)); j > 0; j--)
			{
				System.out.print(" ");
			}
			
			for (int k = (i + 2); k > 0; k--)
			{
				System.out.print("#");
			}
			
			System.out.print("\n");
		
		
		}

	}

}
