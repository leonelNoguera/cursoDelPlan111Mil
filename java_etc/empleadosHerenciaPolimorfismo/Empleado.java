/* Empleado.java
Marcelo Leonel Noguera
24/03/2017
- herencia y polimorfismo*/
public abstract class Empleado implements PorPagar
{
	private String nombre;
	private String apellido;
	private int cuil;

	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	public int getCuil()
	{
		return cuil;
	}
	public void setCuil(int cuil)
	{
		this.cuil = cuil;
	}

	@Override
	public String toString()
	{
		return String.format("Nombre: %s\nApellido: %s\nCuil: %d",getNombre(),getApellido(),getCuil());
	}

	public Empleado(String nombre, String apellido, int cuil)
	{
		setNombre(nombre);
		setApellido(apellido);
		setCuil(cuil);
	}
}