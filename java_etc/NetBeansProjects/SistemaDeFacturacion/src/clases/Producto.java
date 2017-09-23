/* Producto.java
Marcelo Leonel Noguera
19/08/2017*/
package clases;

public class Producto
{

    private String descripcion;
    private long codigo;
    private double precio;
    private int cantidad;

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

    public long getCodigo()
    {
        return codigo;
    }

    public void setCodigo(long codigo)
    {
        this.codigo = codigo;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    
    @Override
    public String toString()
    {
        return String.format("Descripcion: %s\nCodigo: %s\nPrecio: %f\nCantidad: %d",getDescripcion(),getCodigo(),getPrecio(),getCantidad());
    }

    public Producto(String descripcion, int codigo, double precio, int cantidad)
    {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    
}