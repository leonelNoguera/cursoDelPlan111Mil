/*
PruebaEmpleadoPorComision2.java

Alejandro Belo

3/6/2017
*/

import java.util.Scanner;

public class PruebaEmpleadoPorComision2
{
	//private static EmpleadoBaseComision2 empleadoBaseComision2;
	//private static EmpleadoPorComision2 empleadoPorComision2;

	public static void main (String [] agrs)
	{
		Scanner entrada=new Scanner(System.in);
		int error=1;
		do
		{
			/*System.out.println("Ingrese nombre del empleado");
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
			String suel = entrada.nextLine();*/
			try
			{
				//empleado = new EmpleadoBaseComision2 (nom, ape, num, Double.parseDouble(suel), Double.parseDouble(tar), Double.parseDouble(ven));
				//empleadoBaseComision2 = new EmpleadoBaseComision2 ("Marcelo", "Noguera", "52543", 10000.0, 0.2, 10000.0);
				//empleadoPorComision2 = new EmpleadoPorComision2 ("Leonel", "Noguera", "51573", 0.3, 20000.0);
				error=1;
			}
			catch(IllegalArgumentException e)
			{
				error=0;
			}

		}
		while (error==0);
		
		//System.out.printf("%s\n",empleadoPorComision2);
		//System.out.printf("%s\n",empleadoBaseComision2);
		EmpleadoPorComision2 empleadoPorComision1 = new EmpleadoPorComision2("Marcelo", "Noguera", "52543", 0.2, 10000.0);
		EmpleadoBaseComision2 empleadoBaseComision1 = new EmpleadoBaseComision2("Leonel", "Noguera", "52543", 10000.0, 0.2, 10000.0);
		EmpleadoPorComision2 empleadoPorComision2 = new EmpleadoPorComision2("Nahuel", "Noguera", "52543", 0.2, 10000.0);
		EmpleadoBaseComision2 empleadoBaseComision2 = new EmpleadoBaseComision2("Nicolas", "Noguera", "52543", 10000.0, 0.2, 10000.0);

		EmpleadoPorComision2 []empleados = new EmpleadoPorComision2[4];
		empleados[0] = empleadoPorComision1;
		empleados[1] = empleadoBaseComision1;
		empleados[2] = empleadoPorComision2;
		empleados[3] = empleadoBaseComision2;

		for(EmpleadoPorComision2 empleadoActual:empleados)
		{
			System.out.printf("%s\n",empleadoActual);
		}
	}
}