/* DadosRandomArrays.java
Marcelo Leonel Noguera
01/04/2017
ejercicio de Random con dados, tirar 6.000.000 de veces y mostrar los resultados. versión con vectores*/
import java.util.Random;
import javax.swing.JOptionPane;
public class DadosRandomArrays
{
	public static void main(String[]args)
	{
		int numeroR = 0;
		int contador = 0;
		int []contadorR = new int[6];

		Random enterosAleatorios = new Random();
		while (contador<6000000)
		{
			contador++;	
			contadorR[enterosAleatorios.nextInt(6)]++;
		}
		String resultados = String.format(" 1: %d\n 2: %d\n 3: %d\n 4: %d\n 5: %d\n 6: %d\n",contadorR[0],contadorR[1],contadorR[2],contadorR[3],contadorR[4],contadorR[5]);
		JOptionPane.showMessageDialog(null,resultados);
	}
}