/*
EmpleadoPorComision.java

Alejandro Belo

3/6/2017
*/

public class EmpleadoBaseComision extends EmpleadoPorComision
{

	private Double sueldoBase;

	//Constructor
	public EmpleadoBaseComision(String pNombre, String apellidoP, String numSeguro, Double sueldoB, Double tarifaCom, Double ventasB)
	{
		super(pNombre,apellidoP,numSeguro,tarifaCom,ventasB);
		setSueldoBase(sueldoB);
	}

	public void setSueldoBase(Double sue)
	{
		if (sue>=0.0)
		{
			sueldoBase=sue;
		}
    	else
    	{
			throw new IllegalArgumentException("Tamaño incorrecto");
		}
	}

	public Double getSueldoBase()
	{
		return sueldoBase;
	}

	@Override
	public double calcularIngresos()
	{
		double ingresos= getSueldoBase()+(getVentasBrutas()*getTarifaComision());
		return ingresos;
	}
	@Override
	public String toString()
	{
		String informe="";
		informe+=String.format("Empleado por comision: %s %s\n", getPrimerNombre(), getApellidoPaterno());
		informe+=String.format("Seguro: %s \n", getNumeroSeguro());
		informe+=String.format("Ventas Brutas: %.2f \n", getVentasBrutas());
		informe+=String.format("Tarifa comision: %.2f \n", getTarifaComision());
		informe+=String.format("Sueldo base: $ %.2f", getSueldoBase());
		return informe;
	}
}