/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import clases.Producto;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablasConJava extends JPanel
{
    private JTable tabla;
    private JScrollPane panelScroll;
    private String[] nombresColumnas;
    private Object[][] datosColumnas;
    private static GestorProductos gestor;
    public static void run(GestorProductos g)
    {
        gestor = g;
    	JFrame ventana = new JFrame("Tabla de productos");
        ventana.addWindowFocusListener
        (
            new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
            }
        );
        ventana.getContentPane().add(new TablasConJava(), BorderLayout.CENTER);
        ventana.setSize(400, 200);
        ventana.setVisible(true);
    }

    public TablasConJava()
    {
        setLayout(new BorderLayout());
    	cargarNombresColumnas();
    	cargarDatosColumnas();
    	tabla = new JTable(datosColumnas, nombresColumnas);

    	tabla.setShowHorizontalLines(false);
    	tabla.setRowSelectionAllowed(true);
    	tabla.setColumnSelectionAllowed(true);
    	//tabla.setForeground(Color.LIGHT_GRAY);
        //tabla.setBackground(Color.LIGHT_GRAY);
        tabla.setSelectionForeground(Color.yellow);
        tabla.setSelectionBackground(Color.yellow);
        panelScroll = new JScrollPane(tabla);
        add(panelScroll, BorderLayout.CENTER);
    }
    //String descripcion, int codigo, double precio, int cantidad
    public void cargarDatosColumnas()
    {
        datosColumnas = new Object[100][4];
        List<Producto> productos = gestor.obtenerProductos();
        Iterator<Producto> lista = productos.iterator();
        Producto p = null;
        int indice = 0;
        
        while(lista.hasNext())
        {
            p = lista.next();
            datosColumnas[indice][0] = p.getDescripcion();
            datosColumnas[indice][1] = p.getCodigo();
            datosColumnas[indice][2] = p.getPrecio();
            datosColumnas[indice][3] = p.getCantidad();
            indice++;
        }
        
    	
        /*for(int i=0; i<datosColumnas.length; i++)
    	{
    		datosColumnas[i][0] = "";
    	}*/
    }
    public void cargarNombresColumnas()
    {
    	nombresColumnas = new String[4];
    	/*for(int i=0; i<nombresColumnas.length; i++)
    	{
    		nombresColumnas[i] = "Columna " + i;
    	}*/
        nombresColumnas[0] = "Descripcion";
        nombresColumnas[1] = "Codigo";
        nombresColumnas[2] = "Precio";
        nombresColumnas[3] = "Cantidad";
    }
}