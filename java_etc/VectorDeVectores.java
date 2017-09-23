/* VectorDeVectores.java
Marcelo Leonel Noguera
01/04/2017
ejercicio de matrizes*/
import javax.swing.JOptionPane;
public class VectorDeVectores
{
	static int [][]n = {{1,2},{4,5,6},{7,8}};
	static String resultados = "";
	
	public static void informar(int x, int y)
	{
		resultados += String.format("|%d",n[x][y]);
	}
	public static void informar()
	{
		resultados += ("|\n");
	}

	public static void main(String[]args)
	{
		for (int x=0;x<n.length;x++)
		{
			for (int y=0;y<n[x].length;y++)
			{
				informar(x,y);
			}
			informar();
		}
		JOptionPane.showMessageDialog(null,resultados);
	}
}