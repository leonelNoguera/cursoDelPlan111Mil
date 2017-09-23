/* Factura.java
Marcelo Leonel Noguera
19/08/2017*/
package clases;
import java.util.ArrayList;
import java.util.Date;
public class Factura extends Comprobante
{
    public ArrayList<Producto> getProductos()
    {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos)
    {
        this.productos = productos;
    }

    public ArrayList<Cliente> getClientes()
    {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes)
    {
        this.clientes = clientes;
    }

    private ArrayList<Producto> productos;

    private ArrayList<Cliente> clientes;

    public Factura(ArrayList<Producto> productos, ArrayList<Cliente> clientes, Date fecha, String tipo, int numeroIdentificador, double importeTotal)
    {
        super(fecha, tipo, numeroIdentificador, importeTotal);
        this.productos = productos;
        this.clientes = clientes;
    }

    
}
