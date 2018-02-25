package Complex_Numbers_GUI;

import javax.swing.JOptionPane;

public class ComplexNumberDriver
{

	private static double getDouble(String prompt, String title)
	{
		do
		{
			try
			{
				return Double
						.parseDouble(JOptionPane.showInputDialog(null, prompt, title, JOptionPane.INFORMATION_MESSAGE));
			} catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null, "Bad Double", title, JOptionPane.INFORMATION_MESSAGE);
			}
		} while (true);
	}

	public static void main(String[] args)
	{
		final String title = "Complex Numbers";
		double real;
		double imag;

		while (true)
		{
			real = getDouble("Enter the Real Component of Complex Number 1", title);
			imag = getDouble("Enter the Imaginary Component of Complex Number 1", title);
			Complex c1 = new Complex(real, imag);

			real = getDouble("Enter the Real Component of Complex Number 2", title);
			imag = getDouble("Enter the Imaginary Component of Complex Number 2", title);
			Complex c2 = new Complex(real, imag);

			Complex ans = null;

			String options[] =
			{ "Add", "Subtract", "Multiply", "Divide", "Absolute Value", "Negation", "Conjugate", "Distance",
					"Comparison", "Quit" };
			int option = JOptionPane.showOptionDialog(null, "Choose Operation", title, JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, options, 4);
			String output = "" + c1;
			switch (option)
			{
			case 0:
				ans = c1.add(c2);
				output += " + ";
				break;
			case 1:
				ans = c1.subtract(c2);
				output += " - ";
				break;
			case 2:
				ans = c1.multiply(c2);
				output += " * ";
				break;
			case 3:
				ans = c1.divide(c2);
				output += " / ";
				break;
			case 4:
				output += "=" + c1.abs() + "\n" + c1 + "=" + c2.abs();
				break;
			case 5:
				output += "=" + c1.negate() + "\n" + c1 + "=" + c2.negate();
				break;
			case 6:
				output += "=" + c1.conjugate() + "\n" + c1 + "=" + c2.conjugate();
				break;
			case 7:
				output = "The distance between " + c1 + " and " + c2 + " is " + c1.distance(c2);
				break;
			case 8:
				if (c1.greaterThan(c2))
					output += " is larger than " + c2;
				else if (c1.lessThan(c2))
					output += " is smaller than " + c2;
				else if (c1.equal(c2))
					output += " and " + c2 + " are equal or approxamatly equal";
				else
					output = "error";
				break;
			default:
				break;
			}
			if (option > 8)
				break;
			else if (option < 4)
				output += c2 + " = " + ans;
			JOptionPane.showMessageDialog(null, output, title, JOptionPane.PLAIN_MESSAGE);

			option = JOptionPane.showConfirmDialog(null, "Do you want to do this again?", title,
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (option != JOptionPane.YES_OPTION)
				break;
		}

	}

}
