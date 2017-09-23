/* Triangulo.java
Marcelo Noguera
10/06/2017
- P = l1 + l2 + l3
- S = (b.h)/2
*/
public class Triangulo extends Figura2D
{
	private double lado1, lado2, lado3;
	public Triangulo(){}
	public Triangulo(double lado1, double lado2, double lado3)
	{
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
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
		return getLado1()+getLado2()+getLado3();
	}
	@Override
	public double superficie()
	{
		double j = (perimetro())/2;
		return j/lado1*(Math.sqrt((j-lado1)*(j-lado2)*(j-lado3)));
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
	public void setLado3(double lado3)
	{
		this.lado3 = lado3;
	}
	public double getLado3()
	{
		return lado3;
	}
	@Override
	public String toString()
	{
		return String.format("---- triángulo ---\n%s lados:\n  - %f\n  - %f\n  - %f\n",super.toString(),getLado1(),getLado2(),getLado3());
	}
}