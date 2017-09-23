/* FiguraConLineasRectas.java
Marcelo Noguera
10/06/2017
*/
public abstract class FigurasConLineasRectas extends Figura2D
{
	public double desplazamientoX()
	{
		return 0.0;
	}
	public double desplazamientoY()
	{
		return 0.0;
	}
	public double perimetro(double []lados)
	{
		double suma=0;
		for(int x=0;x<lados.length;x++)
		{
			suma += lados[x];
		}
		return suma;
	}
	public double superficie()
	{
	}
}