/* ProductoDaoImpl.java
Marcelo Leonel Noguera
26/08/2017*/
package dao;

import clases.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoDaoImpl implements ProductoDao
{
    List<Producto> productos;

    @Override
    public List<Producto> obtenerTodos()
    {
        return productos;
    }

    @Override
    public void guardarProducto(Producto producto)
    {
        productos.add(producto);
    }

    public ProductoDaoImpl()
    {
        productos = new ArrayList<Producto>();
    }
}
