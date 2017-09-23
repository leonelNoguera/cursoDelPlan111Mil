/* Menu.java
Marcelo Leonel Noguera
19/08/2017

el objetivo es confeccionar la factura de un cliente ticket de impresion
toda factura es un comprobante de venta que ddebe poseer una fecha,
 el tipo de comprobante, un numero, datos del cliente, los productos involucrados
y un importe total
en base al precio de los n productos que posee la factura se calcula el total
en algunos casos el cliente quiere solo remito.


comprobante: fecha, tipo de comprobante, un numero, datos del cliente,
productos, importe total.*/
package menu;

import clases.Producto;
import clases.Comprobante;
import interfaz.MenuPantalla;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;

public class Menu
{
    public static void main(String[] args)
    {
        //PantallaProductos pantallaProductos = new PantallaProductos();
        //pantallaProductos.setVisible(true);
        
        MenuPantalla menuPantalla = new MenuPantalla();
        menuPantalla.setVisible(true);
        
        //String descripcion, int codigo, double precio
        /*Producto producto1 = new Producto("bolsa de cemento",00234152,200.0);
        Producto producto2 = new Producto("bolsa de cal",00214352,100.0);
        Producto producto3 = new Producto("bolsa de pan",02237142,20.0);
        Producto producto4 = new Producto("alfajor capitán del espacio",20224652,20.0);
        Producto producto5 = new Producto("paquete de azucar",50214152,30.0);
        Producto producto6 = new Producto("vaso",60224152,15.0);
        Producto producto7 = new Producto("balde de pintura",00234050,150.0);
        Producto producto8 = new Producto("bolsa de cemento",00234152,200.0);
    	
        ArrayList <Producto> productos = new ArrayList<Producto>();
    	
        productos.add(producto1);
    	productos.add(producto2);
    	productos.add(producto3);
    	productos.add(producto4);
    	productos.add(producto5);
    	productos.add(producto6);
    	productos.add(producto7);
    	productos.add(producto8);
        
    	double promedio = 0.0;
	    Iterator <Producto> lista = productos.iterator();
	    while(lista.hasNext())
	    {
	    	Producto p = lista.next();
	    	promedio += p.getPrecio();
	    	System.out.println(promedio);
	    }*/
    }
}