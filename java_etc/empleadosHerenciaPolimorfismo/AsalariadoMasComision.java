/* AsalariadoMasComision.java
Marcelo Leonel Noguera
24/03/2017
- herencia y polimorfismo*/
public class AsalariadoMasComision extends Asalariado
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


	public AsalariadoMasComision(String nombre, String apellido, int cuil, double salario)
	{
		super(nombre,apellido,cuil,salario);
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