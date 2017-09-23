/* CalificacionBar.java
Marcelo Leonel Noguera
22/04/2017

Se pide a 20 estudiantes de Almafuerte que califiquen la calidad de comida en el bar de Gaby
en una escala de 1 a 5 donde 1 es pésimo y 5 es bueno, colocar las 20 respuestas en un array de enteros
y determine la frequencia de cada calificación. Realizar el gráfico de barras.
Nota: 
caso 1: ingresar 20 valores con lista de inicialización
caso 2: lo mismo con números aleatorios
caso 3: utilizar una GUI de entrada.
*/
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class CalificacionBar
{
	static int []vectorCalificaciones = new int[6];
	
	public static void entradaGui()
	{
		String datoCalificacion = "";
		int intDatoCalificacion = 0;
		int []valoresEncuesta = new int[20];
		String mensajeGui = "Ingrese la calificación:";
		for (int x=0;x<valoresEncuesta.length;x++)
		{
			datoCalificacion = JOptionPane.showInputDialog(mensajeGui);
			try
			{
				intDatoCalificacion = Integer.parseInt(datoCalificacion);
				valoresEncuesta[x] = intDatoCalificacion;
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
				mensajeGui = "Vuelva a intentar:";
				x--;	
			}

			try
			{
				vectorCalificaciones[valoresEncuesta[x]]++;
				mensajeGui = "Ingrese la calificación:";
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.printf("\nvaloresEncuesta[%d] = %d\n",x,valoresEncuesta[x]);
				mensajeGui = "Vuelva a intentar:";
				x--;
			}
			if (intDatoCalificacion<1)
			{
				System.out.printf("\nvectorCalificaciones[%d] = %d\n",x,vectorCalificaciones[x]);
				mensajeGui = "Vuelva a intentar:";
				x--;
			}
		}
	}

	public static void graficoBarras()
	{
		String barras = "";
		String asteriscos = "";
		for (int x=1;x<vectorCalificaciones.length;x++)
		{
			for (int j=0;j<vectorCalificaciones[x];j++)
			{
				asteriscos += String.format("*");
			}
			
			barras += String.format(" %d: %s\n",x,asteriscos);
			asteriscos = "";
		}
		System.out.printf("%s\n",barras);
	}

	public static void numerosAleatorios()
	{	
		Random valoresAleatorios = new Random();
		int []valoresEncuesta = new int[20];
		for (int x=0;x<valoresEncuesta.length;x++)
		{
			valoresEncuesta[x] = 1 + valoresAleatorios.nextInt(5);
		}
		for (int x=0;x<valoresEncuesta.length;x++)
		{
			vectorCalificaciones[valoresEncuesta[x]] = vectorCalificaciones[valoresEncuesta[x]] + 1;
		}
	}
	public static void listaInicializacion()
	{
		int valoresEncuesta[] = {5,2,1,4,5,3,4,3,4,1,5,1,4,2,2,3,4,2,1,1};
		for (int x=0;x<valoresEncuesta.length;x++)
		{
			vectorCalificaciones[valoresEncuesta[x]] = vectorCalificaciones[valoresEncuesta[x]] + 1;
		}
	}

	public static void main(String[]args)
	{
		listaInicializacion();
		graficoBarras();
		for (int x=1;x<vectorCalificaciones.length;x++)
		{
			vectorCalificaciones[x] = 0;
		}
		numerosAleatorios();
		graficoBarras();
		for (int x=1;x<vectorCalificaciones.length;x++)
		{
			vectorCalificaciones[x] = 0;
		}
		entradaGui();
		graficoBarras();
	}
}