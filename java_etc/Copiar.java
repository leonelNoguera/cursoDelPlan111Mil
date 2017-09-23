/*Copiar.java
Marcelo Leonel Noguera
29/04/2017
- recibe parámetros para copiar algo
*/
import javax.swing.JOptionPane;
public class Copiar
{
	public static void main(String[]args)
	{
		switch (args.length)
		{
			case 0:
			case 1:
				System.out.println("faltan parámetros");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("sobran parámetros");
			default:
				for(String elmento:args)
				{
					System.out.println(elmento);		
				}
		}
	}
}