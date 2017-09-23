/*Vector.java
Marcelo Leonel Noguera
29/04/2017
- recibe parámetros para armar un vector (tamaño, valor del primer elemento, separación)
*/
public class Vector
{
	public static void main(String[]args)
	{
		switch (args.length)
		{
			case 0:
			case 1:
			case 2:
				System.out.println("faltan parámetros");
				break;
			case 3:
				int []vectorArmado = new int[Integer.parseInt(args[0])];
				vectorArmado[0] = Integer.parseInt(args[1]);
				for(int x=1;x<vectorArmado.length;x++)
				{
					vectorArmado[x] = vectorArmado[x-1] + Integer.parseInt(args[2]);
				}

				for(int dato:vectorArmado)
				{
					System.out.println(dato);
				}
				break;
			default:
				System.out.println("sobran parámetros");
		}
	}
}