/* CuadradoRectangulo.java
Marcelo Noguera
10/06/2017
*/
public class CuadradoRectangulo extends Figura2D
{
	private double lado1, lado2;
	public CuadradoRectangulo(){}
	public CuadradoRectangulo(double lado1, double lado2)
	{
		setLado1(lado1);
		setLado2(lado2);
	}
	public void desplazamientoX(double x)
	{
		super.desplazamientoX(x);
	}
	public void desplazamientoY(double y)
	{
		super.desplazamientoY(y);
	}

	@Override
	public double perimetro()
	{
		return (getLado1()+getLado2())*2;
	}
	@Override
	public double superficie()
	{
		return ((getLado1()*getLado2())*getLado1())*getLado2();
	}

	public void setLado1(double lado1)
	{
		this.lado1 = lado1;
	}
	public double getLado1()
	{
		return lado1;
	}
	public void setLado2(double lado2)
	{
		this.lado2 = lado2;
	}
	public double getLado2()
	{
		return lado2;
	}
	@Override
	public String toString()
	{
		return String.format("---- cuadrado o rectángulo ---\n%s lados:\n  - %f\n  - %f\n  - %f\n  - %f\n",super.toString(),getLado1(),getLado2(),getLado1(),getLado2());
	}
}