/*Promedio.java
Marcelo Leonel Noguera
06/05/2017
- calcula el promedio, usa sobrecarga de métodos "metodo(...double vec)"
*/
public class Promedio
{
	public static double calcularPromedio(double... vector)
	{
		double suma = 0;
		for(double dato:vector)
		{
			suma += dato;
		}
		return suma/vector.length;
	}

	public static void main(String[]args)
	{
		switch (args.length)
		{
			case 0:
				System.out.println("faltan parámetros");
				break;
			case 1:
				System.out.printf("\nEl promedio es: %f\n",(calcularPromedio(Double.parseDouble(args[0]))));
				break;
			case 2:
				System.out.printf("\nEl promedio es: %f\n",(calcularPromedio(Double.parseDouble(args[0]),Double.parseDouble(args[1]))));
				break;
			case 3:
				System.out.printf("\nEl promedio es: %f\n",(calcularPromedio(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]))));
				break;
			case 4:
				System.out.printf("\nEl promedio es: %f\n",(calcularPromedio(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]))));
				break;
			case 5:
				System.out.printf("\nEl promedio es: %f\n",(calcularPromedio(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]),Double.parseDouble(args[4]))));
				break;
			default:
				System.out.println("sobran parámetros");
		}
	}
}