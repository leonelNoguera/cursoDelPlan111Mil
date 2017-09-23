/* GestorProductos.java
Marcelo Leonel Noguera
26/08/2017*/

package menu;

import clases.Producto;
import dao.ProductoDaoImpl;
import java.util.List;

public class GestorProductos 
{
    private final ProductoDaoImpl productosDaoImpl = new ProductoDaoImpl();
    public void run()
    {
    	PantallaProductos pantallaProductos = new PantallaProductos(this);
    	pantallaProductos.setVisible(true);
    }
    public void guardarProducto(Producto producto)
    {
    	productosDaoImpl.guardarProducto(producto);
    }
    public List<Producto> obtenerProductos()
    {
    	return productosDaoImpl.obtenerTodos();
    }
}
