/* Application.java
Marcelo Leonel Noguera
15/07/2017
- aplicacion que obtiene datos de "FormularioCargaEmpleados" y lo envía a "Empleado"*/
import javax.swing.JFrame;
public class Application extends Empleado
{
	public static void main(String[]args)
	{
		int c=0;
		int d = c++;
		System.out.println(d);

		/*FormularioCargaDeEmpleados formularioCargaDeEmpleados = new FormularioCargaDeEmpleados();
		formularioCargaDeEmpleados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioCargaDeEmpleados.setSize(350,350);
		formularioCargaDeEmpleados.setVisible(true);
		new Application("Leonel","Noguera",10000);*/
	}
	@Override
	public double obtenerPago()
	{
		return 0.0;
	}
	public Application(String nombre, String apellido, int cuil)
	{
		super(nombre,apellido,cuil);
		//
		System.out.println(super.toString());
	}
}