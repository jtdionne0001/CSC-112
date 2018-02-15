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
		return new Complex(this.r + c.r, this.im + c.im);
	}

	public Complex subtract(Complex c)
	{
		return new Complex(this.r - c.r, this.im - c.im);
	}

	public Complex multiply(Complex c)
	{
		return new Complex(this.r * c.r - this.im * c.im,
				this.r * c.im + c.r * this.im);
	}

	public Complex divide(Complex c)
	{
		return new Complex(
				(this.r * c.r + this.im * c.im) / (Math.pow(c.r, 2) + Math.pow(c.im, 2)),
				(this.im * c.r + this.r * c.im) / (Math.pow(c.r, 2) + Math.pow(c.im, 2)));
	}

	public Complex negate()
	{
		return new Complex(-this.r, -this.im);
	}

	public Complex conjugate()
	{
		return new Complex(this.r, -this.im);
	}

	public double abs()
	{
		return (Math.sqrt(Math.pow(this.r, 2) + Math.pow(this.im, 2)));
	}

	public double distance(Complex c)
	{
		return (Math.sqrt(Math.pow(this.r - c.r, 2) + Math.pow(this.im - c.im, 2)));
	}

	public boolean equal(Complex c)
	{
		return (1E-6 <= Math.sqrt(Math.pow(this.r - c.r, 2) + Math.pow(this.im - c.im, 2)));
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
		return this.r + " + " + this.im + "i";
	}

}
