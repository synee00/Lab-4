/*Jasmine S. Allen
 * July 18, 2018
 * Program: Prompt the user to enter an integer. Display a table of squares and 
 * 			cubes from 1 to the value entered. Ask if the user wants to continue.
 */


import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int userNum = 0;
		int squared = 0;
		int cubed = 0;
		
		String choice = "y";
					
		System.out.println("Learn your squares and cubes!");

		while(choice.matches("y"))
		{
			System.out.print("Please enter an integer: ");
			userNum = scan.nextInt();
			
			//System.out.println();
			System.out.println();
			
			String headerText = String.format("%-15s %-15s %-15s", "Number", "Squared", "Cubed");
			String underline = String.format("%-15s %-15s %-15s", "=======", "=======", "======");
			
			System.out.println(headerText);
			System.out.println(underline);
			
			for(int i = 1; i <= userNum; i++)
			{
				squared = i*i;
				cubed = i*(i*i);
				String outputText = String.format("%-15d %-15d %-15d", i, squared, cubed);
				System.out.println(outputText);
			}
			System.out.println();
			System.out.print("Do you wish to continue (y/n)?  ");
			choice = scan.next();
		}
	}
	
	

}
