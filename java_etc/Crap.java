/* Crap.java
Marcelo Leonel Noguera
08/04/2017
ejercicio de simulación de crap*/
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Crap
{
	static int resultado = 0;
	static int resultado2 = 0;
	static int contador = 0;
	static boolean z=true;
	static String conjuntoResultados = "";
	static int j=1;

	public static void tirar()
	{
		Random enterosAleatorios = new Random();
		if(z==true)
		{
			resultado = 1 + enterosAleatorios.nextInt(6);
			resultado = resultado + 1 + enterosAleatorios.nextInt(6);
			conjuntoResultados += String.format(" - %d",resultado);
			comparar();
		}
	}
	public static void comparar()
	{
		switch (resultado)
			{
				case 2:
				case 3:
				case 12:
					if(resultado2==0)
					{
						perder();
					}
					else
					{
						tirar();
					}
					break;
				case 7:
					if(resultado2==0)
					{
						ganar();
					}
					else
					{
						perder();
					}
					break;
				case 11:
					if(resultado2==0)
					{
						ganar();
					}
					else
					{
						tirar();
					}
					break;
				default:
					compararPunto();
					break;
			}
	}

	public static void compararPunto()
	{
		if(resultado2==0)
		{
			resultado2 = resultado;
		}
		else if(resultado2==resultado)
		{
			ganar();
		}
		tirar();
	}

	public static void ganar()
	{
		if(resultado2==resultado)
		{
			conjuntoResultados += String.format("\nGanó porque tocó %d dos veces\n\n",resultado);
		}
		else
		{
			conjuntoResultados += String.format("\nGanó porque tocó: %d\n\n",resultado);
		}
		z = false;
	}
	
	public static void perder()
	{
		if(resultado==7)
		{
			conjuntoResultados += String.format("\nPerdió porque tocó %d luego de tocar el punto %d\n\n",resultado,resultado2);
		}
		else
		{
			conjuntoResultados += String.format("\nPerdió porque tocó %d\n\n",resultado);
		}

		z = false;
	}
	public static void main(String[]args)
	{
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Cuantas veces desea jugar?: ");
		int x = entrada.nextInt();
		for(j=1;j<x+1;j++)
		{
			conjuntoResultados += String.format(" ----- Jugadad n°%d -----\n",j);
			tirar();
			JOptionPane.showMessageDialog(null,conjuntoResultados);
			resultado = 0;
			resultado2 = 0;
			contador = 0;
			z=true;
			conjuntoResultados = "";
		}
	}
}