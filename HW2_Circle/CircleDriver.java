/*
 * Name: Jacob Dionne
 * Date:
 * Course Number:
 * Course Name:
 * Problem Number:
 * Email:
 * Short Description of the Problem
 */
package HW2_Circle;
import java.util.Scanner;

public class CircleDriver
{

	// **********************************************

	private static void process(Scanner sc, String args[])
	{
		
	}

	// **********************************************

	private static boolean doThisAgain(Scanner sc, String prompt)
	{
		System.out.print(prompt);
		String doOver = sc.nextLine();
		return doOver.equalsIgnoreCase("Y");
	}

	// **********************************************

	public static void main(String args[])
	{
		final String TITLE = "Circles for Silvestri";
		final String CONTINUE_PROMPT = "Do this again? [y/N] ";

		System.out.println("Welcome to " + TITLE);
		Scanner sc = new Scanner(System.in);
		do
		{
			process(sc, args);
		} while (doThisAgain(sc, CONTINUE_PROMPT));
		sc.close();
		System.out.println("Thank you for using " + TITLE);
	}

}
