/* Servicios.java
Marcelo Leonel Noguera
24/03/2017
- herencia y polimorfismo*/
public class Servicios implements PorPagar
{
	private String descripcion;
	private int numeroDeCliente;
	private String empresa;
	private double monto;
	private Fecha fecha;

	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	public int getNumeroDeCliente()
	{
		return numeroDeCliente;
	}
	public void setNumeroDeCliente(int numeroDeCliente)
	{
		this.numeroDeCliente = numeroDeCliente;
	}
	public String getEmpresa()
	{
		return empresa;
	}
	public void setEmpresa(String empresa)
	{
		this.empresa = empresa;
	}
	public double getMonto()
	{
		return monto;
	}
	public void setMonto(double monto)
	{
		this.monto = monto;
	}
	public Fecha getFecha()
	{
		return fecha;
	}
	public void setFecha(Fecha fecha)
	{
		fecha = new Fecha(fecha);
	}

	public Servicios(String descripcion, int numeroDeCliente, String empresa, double monto, Fecha fecha)
	{
		setDescripcion(descripcion);
		setNumeroDeCliente(numeroDeCliente);
		setEmpresa(empresa);
		setMonto(monto);
		this.fecha = new Fecha(fecha);
	}

	public String toString()
	{
		return String.format("Descripcion: %s\nn° de cliente: %d\nEmpresa: %s\nMonto: %f\nFecha: %s",getDescripcion(),getNumeroDeCliente(),getEmpresa(),getMonto(),getFecha());
	}
	
	@Override
	public double obtenerPago()
	{
		return getMonto();
	}
}