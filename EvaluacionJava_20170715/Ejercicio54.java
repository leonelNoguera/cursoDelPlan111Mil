/* Ejercicio54.java
Marcelo Leonel Noguera
15/07/2017
ejercicio 54 de la Evaluación de Java*/
import java.util.Random;
public class Ejercicio54
{
	public static void main(String[]args)
	{
		int numeroR = 0;
		Random enterosAleatorios = new Random();
		numeroR = 1 + enterosAleatorios.nextInt(6);
		System.out.println(numeroR);
		numeroR = 1 + enterosAleatorios.nextInt(6);
		System.out.println(numeroR);
	}
}