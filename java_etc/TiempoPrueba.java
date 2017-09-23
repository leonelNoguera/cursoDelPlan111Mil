/* TiempoPrueba.java
Marcelo Leonel Noguera
13/05/2017
Clase para manejar el tiempo
*/
import java.util.Random;
import java.util.Scanner;
public class TiempoPrueba {

	static int []numeros = new int[3];
	public static Tiempo bateriaDeDatos()
	{
		Random numerosAleatorios = new Random();
		Tiempo t = new Tiempo();
		for(int x=0;x<3;x++)
		{
			t.setHora(numerosAleatorios.nextInt(25));
			t.setMinuto(numerosAleatorios.nextInt(61));
			t.setSegundo(numerosAleatorios.nextInt(61));
		}
		return t;
	}

	public static void main(String[]args)
	{

		System.out.printf(" ¿Cuantos tiempos quiere generar?: ");
		Scanner entrada = new Scanner(System.in);
		int cantidadDeTiempos = entrada.nextInt();
		int contadorErrores = 0;
		Tiempo []tiempos = new Tiempo[cantidadDeTiempos];
		for(int x=0;x<cantidadDeTiempos;x++)
		{
			try
			{
				tiempos[x] = new Tiempo(bateriaDeDatos());
				System.out.printf("%s\n",tiempos[x].informe());
			}
			catch(IllegalArgumentException e)
			{
				contadorErrores += 1;
				x--;
			}
		}
		System.out.printf("\nOcurrió error %d veces.\n",contadorErrores);
	}
}