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
			
			String options[] = { "Add", "Subtract", "Multiply", "Divide", "Quit" };
			int option = JOptionPane.showOptionDialog(null, "Choose Operation", title, JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, options, 4);
			String output = "" + c1;
			switch (option) {
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
			default:
				break;
			}
			if (option > 3)
				break;
			output += c2 + " = " + ans;
			JOptionPane.showMessageDialog(null, output, title, JOptionPane.PLAIN_MESSAGE);

			option = JOptionPane.showConfirmDialog(null, "Do you want to do this again?", title,
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (option != JOptionPane.YES_OPTION)
				break;
		}

	}

}
