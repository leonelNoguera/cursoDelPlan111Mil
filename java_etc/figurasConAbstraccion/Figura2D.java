/* Figura2D.java
Marcelo Noguera
10/06/2017
- x, y
- perimetro(), superficie(), desplazamientoX(), desplazamientoY()
*/
public abstract class Figura2D
{
	private double x;
	private double y;

	public abstract double perimetro();
	public abstract double superficie();
	//public abstract double desplazamientoX();
	//public abstract double desplazamientoY();

	public void desplazamientoX(double x)
	{
		setX(getX()+x);
	}
	public void desplazamientoY(double y)
	{
		setY(getY()+y);
	}

	public void setX(double x)
	{
		this.x = x;
	}
	public double getX()
	{
		return x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public double getY()
	{
		return y;
	}
	public String toString()
	{
		return String.format(" perimetro: %f\n superficie: %f\n",perimetro(),superficie());
	}
}