/* Factura.java
Marcelo Leonel Noguera
24/03/2017
- herencia y polimorfismo*/
public class Factura implements PorPagar
{
	private double precio;
	private int cantidad;
	private String descripcion;
	private int item;
	private String nombre;

	public double getPrecio()
	{
		return precio;
	}
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
	public int getCantidad()
	{
		return cantidad;
	}
	public void setCantidad(int cantidad)
	{
		this.cantidad = cantidad;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
	public int getItem()
	{
		return item;
	}
	public void setItem(int item)
	{
		this.item = item;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public Factura(String descripcion, String nombre, int item, int cantidad, double precio)
	{
		setDescripcion(descripcion);
		setNombre(nombre);
		setItem(item);
		setCantidad(cantidad);
		setPrecio(precio);
	}

	public String toString()
	{
		return String.format("Descripcion: %s\nNombre: %s\nItem: %d\nCantidad: %d\nPrecio: %f",getDescripcion(),getNombre(),getItem(),getCantidad(),getPrecio());
	}

	@Override
	public double obtenerPago()
	{
		return getCantidad()*getPrecio();
	}
}