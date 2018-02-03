/*
 * Name: Jacob Dionne
 * Date: 02/03/2018
 * Course Number: CSC-112
 * Course Name: Itermediate Java
 * Problem Number: 2
 * Email: jtdionne0001@student.stcc.edu
 * This program creates and compares circles
 */
package HW2_Circle;

import java.util.Scanner;

public class CircleDriver
{

	private static Circle buildCircle(Scanner sc, String prompt)
	{
		double x;
		double y;
		double radius;
			System.out.print(prompt);
			System.out.printf("\nx:");
			x = sc.nextDouble();
			System.out.printf("y:");
			y = sc.nextDouble();
			do
			{
				System.out.printf("radius:");
				radius = sc.nextDouble();
				sc.nextLine(); // Clear Keyboard
				if (radius >= 0)
					break;
				System.out.println(
						"Not a valid circle! radius is invalid. Value must be greater than 0. Please reenter the radius.");
			} while (true);
		return new Circle(x, y, radius);
	}

	// **********************************************

	private static void testThemCircles(Circle c1, Circle c2)
	{
		System.out.printf("Area of Circle c1 = %.3f, the perimeter = %.3f\n", c1.getArea(), c1.getPerimeter());
		System.out.printf("Area of Circle c2 = %.3f, the perimeter = %.3f\n", c2.getArea(), c2.getPerimeter());

		double radiusDist = Math.sqrt(Math.pow(c1.getX() - c2.getX(), 2) + Math.pow(c1.getY() - c2.getY(), 2));
		System.out.printf("The distance between their centers is: %.3f\n", radiusDist);

		if (c2.contains(c1))
			System.out.println("c2 contains c1");
		else if (c1.contains(c2))
			System.out.println("c1 contains c2");
		else if (c2.overlaps(c1))
			System.out.println("Circle c1 and Circle c2 overlap.");
		else
			System.out.println("Circle c1 and Circle c2 do not overlap or contain each other.");
	}

	// **********************************************

	private static void testThosePoints(Scanner sc, Circle c1, Circle c2)
	{
		System.out.println("Now, please enter any point (x,y): ");
		double px = sc.nextDouble();
		double py = sc.nextDouble();
		sc.nextLine();
		System.out.println("Circle 1 " + (c1.contains(px, py) ? "contains " : "does not contain ") + "this point.");
		System.out.println("Circle 2 " + (c2.contains(px, py) ? "contains " : "does not contain ") + "this point.");
	}

	// **********************************************

	private static void process(Scanner sc, String args[])
	{
		Circle c1 = buildCircle(sc, "Enter x and y values for the center (x,y) followed by the radius for Circle 1: ");
		Circle c2 = buildCircle(sc, "Enter x and y values for the center (x,y) followed by the radius for Circle 2: ");
		testThemCircles(c1, c2);
		testThosePoints(sc, c1, c2);
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
