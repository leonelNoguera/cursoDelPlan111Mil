/* ProductoDao.java
Marcelo Leonel Noguera
26/08/2017*/
package dao;

import clases.Producto;
import java.util.List;

public interface ProductoDao
{
    List<Producto> obtenerTodos();
    void guardarProducto(Producto producto);
}