/* ArrayMatriz.java
Marcelo Leonel Noguera
01/04/2017
ejercicio de matrizes*/
import javax.swing.JOptionPane;
public class ArrayMatriz
{
	public static void main(String[]args)
	{
		int [][]numeros = new int[3][4];
		String resultados = "";

		for (int x=0;x<4;x++)
		{
			for (int y=0;y<3;y++)
			{
				numeros[y][x] = y;
			}
		}
		for (int y=0;y<3;y++)
		{
			for (int x=0;x<4;x++)
			{
				resultados += String.format("|%d",numeros[y][x]);
			}
			resultados += ("|\n");
		}

		resultados += ("\n");

		for (int x=0;x<3;x++)
		{
			for (int y=0;y<4;y++)
			{
				numeros[x][y] = y;
			}
		}
		for (int x=0;x<3;x++)
		{
			for (int y=0;y<4;y++)
			{
				resultados += String.format("|%d",numeros[x][y]);
			}
			resultados += ("|\n");
		}
		//resultados += String.format("\n|%d|%d|%d|%d|\n|%d|%d|%d|%d|\n|%d|%d|%d|%d|\n",numeros[0][0],numeros[0][1],numeros[0][2],numeros[0][3],numeros[1][0],numeros[1][1],numeros[1][2],numeros[1][3],numeros[2][0],numeros[2][1],numeros[2][2],numeros[2][3]);
		System.out.println(resultados);
		JOptionPane.showMessageDialog(null,resultados);
	}
}