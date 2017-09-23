/* PruebaEmpleadosHerenciaPolimorfismoConGui.java
Marcelo Leonel Noguera
24/03/2017
- herencia y polimorfismo
- se le agrega Gui*/
import javax.swing.JFrame;
public class PruebaEmpleadosHerenciaPolimorfismoConGui
{
	public static void main(String[]args)
	{

		CargaDeEmpleados cargaDeEmpleados = new CargaDeEmpleados();
		cargaDeEmpleados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cargaDeEmpleados.setSize(350,350);
		cargaDeEmpleados.setVisible(true);
		
		/*Empleado []empleados = new Empleado[3];
		empleados[0] = new Empleado(empleado.getEmpleado());
		empleados[1] = new Empleado(empleado.getEmpleado());
		empleados[2] = new Empleado(empleado.getEmpleado());*/ // error con 'empleado'

		/*for(PorPagar empleadoActual:empleados)
		{
			System.out.printf("%s\n",empleadoActual);
		}*/
	}
}