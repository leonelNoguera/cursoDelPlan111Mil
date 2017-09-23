/* Circulo.java
Marcelo Noguera
10/06/2017
- P = pi.R o d.R
- S = pi.(R.R)
*/
public class Circulo extends Figura2D
{
	private double radio;
	public Circulo(){}
	public Circulo(double radio)
	{
		setRadio(radio);
	}
	public void desplazamientoX(double x)
	{
		super.desplazamientoX(x);
	}
	public void desplazamientoY(double y)
	{
		super.desplazamientoY(y);
	}
	public double perimetro()
	{
		return (Math.PI)*getRadio();
	}
	public double superficie()
	{
		return (Math.PI)*(getRadio()*getRadio());
	}

	public void setRadio(double radio)
	{
		this.radio = radio;
	}
	public double getRadio()
	{
		return radio;
	}
	@Override
	public String toString()
	{
		return String.format("---- círculo ---\n%s radio: %f\n",super.toString(),getRadio());
	}
}