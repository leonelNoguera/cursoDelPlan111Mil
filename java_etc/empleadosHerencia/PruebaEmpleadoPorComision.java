/*
PruebaEmpleadoPorComision.java

Alejandro Belo

3/6/2017
*/

import java.util.Scanner;

public class PruebaEmpleadoPorComision
{
	private static EmpleadoPorComision empleado;

	public static void main (String [] agrs)
	{
		Scanner entrada=new Scanner(System.in);
		int error=1;
		do
		{
			System.out.println("Ingrese nombre del empleado");
			String nom = entrada.nextLine();
			System.out.println("Ingrese apellido del empleado");
			String ape = entrada.nextLine();
			System.out.println("Ingrese numero de seguro");
			String num = entrada.nextLine();
			System.out.println("Ingrese ventas brutas");
			String ven = entrada.nextLine();
			System.out.println("Ingrese tarifa por comision");
			String tar = entrada.nextLine();
			System.out.println("Ingrese sueldo base");
			String suel = entrada.nextLine();
			try
			{
				empleado = new EmpleadoBaseComision (nom, ape, num, Double.parseDouble(suel), Double.parseDouble(tar), Double.parseDouble(ven));
				error=1;
			}
			catch(IllegalArgumentException e)
			{
				error=0;
			}

		}
		while (error==0);

		System.out.println(empleado.toString());
		System.out.println("-----------------------------------");
		String ingresos="";
		System.out.printf("Ingresos: %.2f",empleado.calcularIngresos());
	}
}