/*
EmpleadoPorComision2.java

Alejandro Belo

3/6/2017
*/

public class EmpleadoBaseComision2 extends EmpleadoPorComision2
{

	private Double sueldoBase;

	//Constructor
	public EmpleadoBaseComision2(String pNombre, String apellidoP, String numSeguro, Double sueldoB, Double tarifaCom, Double ventasB)
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
		double ingresos= getSueldoBase()+(super.calcularIngresos());
		return ingresos;
	}
	@Override
	public String toString()
	{
		String informe="";
		informe+=super.toString();
		informe+=String.format("Sueldo base: $ %.2f", getSueldoBase());
		return informe;
	}
}