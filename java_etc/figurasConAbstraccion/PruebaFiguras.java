/* PruebaFiguras.java
Marcelo Noguera
10/06/2017
*/
public class PruebaFiguras
{
	public static void main (String [] agrs)
	{
		Figura2D []figuras = new Figura2D[3];
		figuras[0] = new CuadradoRectangulo(10.0,8.0);
		figuras[1] = new Circulo(10.3);
		figuras[2] = new Triangulo(10.0,7.0,8.0);
		
		for(Figura2D figuraActual:figuras)
		{
			System.out.printf("%s",figuraActual);
		}

		//System.out.printf("%s%s%s",cuadradoRectangulo,circulo,triangulo);
	}
}