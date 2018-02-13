package Complex_Numbers;

import java.util.Scanner;

public class ComplexNumberDriver
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double real;
		double imag;

		while (true)
		{
			System.out.println("Enter Real And Imaginary Components of Complex Number 1: ");
			System.out.print("Real:");
			real = sc.nextDouble();
			System.out.print("Imaginary:");
			imag = sc.nextDouble();
			Complex c1 = new Complex(real, imag);

			System.out.println("Enter Real And Imaginary Components of Complex Number 2: ");
			System.out.print("Real:");
			real = sc.nextDouble();
			System.out.print("Imaginary:");
			imag = sc.nextDouble();
			Complex c2 = new Complex(real, imag);

			sc.nextLine();

			Complex plus = c1.add(c2);
			Complex minus = c1.subtract(c2);
			Complex times = c1.multiply(c2);
			Complex quot = c1.divide(c2);
			System.out.println("c1      = " + c1);
			System.out.println("c2      = " + c2);
			System.out.println("c1 + c2 = " + plus);
			System.out.println("c1 - c2 = " + minus);
			System.out.println("c1 * c2 = " + times);
			System.out.println("c1 / c2 = " + quot);
			System.out.println("-c1     = " + c1.negate());
			System.out.println("-c2     = " + c2.negate());
			System.out.println("Conj c1 = " + c1.conjugate());
			System.out.println("Conj c2 = " + c2.conjugate());
			System.out.println("|c1|    = " + c1.abs());
			System.out.println("|c2|    = " + c2.abs());
			System.out.println("Dist    = " + c1.distance(c2));
			System.out.println("==?     = " + c1.equals(c2));
			System.out.println(">?      = " + c1.greaterThan(c2));
			System.out.println("<?      = " + c1.lessThan(c2));

			System.out.print("Do again? ");
			if (!sc.next().toUpperCase().equals("Y"))
				break;
			sc.nextLine();
			sc.close();
		}

	}

}
