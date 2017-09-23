/*Prueba.java
Marcelo Leonel Noguera
29/04/2017
- Simular poker
*/
public class Prueba
{
	public static void main(String[]args)
	{
		Mazo juego = new Mazo();
		juego.barajar();
		for (int x=1;x<=52;x++)
		{
			System.out.printf("%-20s",juego.repartir());
			if(x%4 == 0)
			{
				System.out.println();
			}
		}
	}
}