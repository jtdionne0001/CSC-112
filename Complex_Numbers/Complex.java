package Complex_Numbers;

import java.lang.Math;

public class Complex
{
	private double r;
	private double im;

	public Complex(double real, double imag)
	{
		setR(real);
		setim(imag);
	}

	public Complex add(Complex c)
	{
		return new Complex(this.getR() + c.getR(), this.getim() + c.getim());
	}

	public Complex subtract(Complex c)
	{
		return new Complex(this.getR() - c.getR(), this.getim() - c.getim());
	}

	public Complex multiply(Complex c)
	{
		return new Complex(this.getR() * c.getR() - this.getim() * c.getim(),
				this.getR() * c.getim() + c.getR() * this.getim());
	}

	public Complex divide(Complex c)
	{
		return new Complex(
				(this.getR() * c.getR() + this.getim() * c.getim()) / (Math.pow(c.getR(), 2) + Math.pow(c.getim(), 2)),
				(this.getim() * c.getR() + this.getR() * c.getim()) / (Math.pow(c.getR(), 2) + Math.pow(c.getim(), 2)));
	}

	public Complex negate()
	{
		return new Complex(-this.getR(), -this.getim());
	}

	public Complex conjugate()
	{
		return new Complex(this.getR(), -this.getim());
	}

	public double abs()
	{
		return (Math.sqrt(Math.pow(this.getR(), 2) + Math.pow(this.getim(), 2)));
	}

	public double distance(Complex c)
	{
		return (Math.sqrt(Math.pow(this.getR() - c.getR(), 2) + Math.pow(this.getim() - c.getim(), 2)));
	}

	public boolean equal(Complex c)
	{
		return (1E-6 <= Math.sqrt(Math.pow(this.getR() - c.getR(), 2) + Math.pow(this.getim() - c.getim(), 2)));
	}

	public boolean greaterThan(Complex c)
	{
		return (this.abs() > c.abs());
	}
	
	public boolean lessThan(Complex c)
	{
		return (this.abs() < c.abs());
	}

	public double getR()
	{
		return r;
	}

	public void setR(double r)
	{
		this.r = r;
	}

	public double getim()
	{
		return im;
	}

	public void setim(double im)
	{
		this.im = im;
	}

	@Override
	public String toString()
	{
		return this.getR() + " + " + this.getim() + "i";
	}

}
