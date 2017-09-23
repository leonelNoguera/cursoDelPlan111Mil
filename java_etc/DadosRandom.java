/* DadosRandom.java
Marcelo Leonel Noguera
01/04/2017
ejercicio de Random con dados, tirar 6.000.000 de veces y mostrar los resultados*/
import java.util.Random;
import javax.swing.JOptionPane;
public class DadosRandom
{
	public static void main(String[]args)
	{
		int numeroR = 0;
		long contador = 0;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5 = 0;
		int contador6 = 0;

		Random enterosAleatorios = new Random();
		while (contador<6000000)
		{
			numeroR = 1 + enterosAleatorios.nextInt(6);
			contador++;
			switch (numeroR)
			{
				case 1:
					contador1++;
					break;
				case 2:
					contador2++;
					break;
				case 3:
					contador3++;
					break;
				case 4:
					contador4++;
					break;
				case 5:
					contador5++;
					break;
				case 6:
					contador6++;
					break;
			}
		}
		String resultados = String.format(" 1: %d\n 2: %d\n 3: %d\n 4: %d\n 5: %d\n 6: %d\n",contador1,contador2,contador3,contador4,contador5,contador6);
		JOptionPane.showMessageDialog(null,resultados);
	}
}