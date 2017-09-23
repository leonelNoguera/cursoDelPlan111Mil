/* Asalariado.java
Marcelo Leonel Noguera
24/03/2017
- herencia y polimorfismo*/
public class Asalariado extends Empleado implements PorPagar
{
	private double salario;
	
	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double salario)
	{
		this.salario = salario;
	}


	public Asalariado(String nombre, String apellido, int cuil, double salario)
	{
		super(nombre,apellido,cuil);
		setSalario(salario);
	}

	@Override
	public String toString()
	{
		return String.format("%sSalario: %f",super.toString(),getSalario());
	}
	@Override
	public double obtenerPago()
	{
		return getSalario();
	}
}