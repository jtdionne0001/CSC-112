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

import java.lang.Math;

public class Circle
{
	final private double PI = 3.1415;
	private double x;
	private double y;
	private double radius;

	public Circle(double x, double y, double radius)
	{
		this.setX(x);
		this.setY(y);
		this.setRadius(radius);
	}

	public Circle()
	{
		this(0, 0, 1);
	}

	public double getArea()
	{
		return (PI * getRadius() * getRadius());
	}

	public double getPerimeter()
	{
		return (2 * PI * getRadius());
	}

	private double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public boolean contains(double x, double y)
	{
		return (this.radius >= distance(this.x, this.y, x, y));
	}

	public boolean contains(Circle a)
	{
		return (this.radius >= (distance(this.x, this.y, a.x, a.y) + a.radius));
	}

	public boolean overlaps(Circle a)
	{
		return ((distance(this.x, this.y, a.x, a.y) >= this.radius + a.radius)
				&& (this.radius + a.radius >= this.radius));
	}

	public double getX()
	{
		return x;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public double getY()
	{
		return y;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

}
