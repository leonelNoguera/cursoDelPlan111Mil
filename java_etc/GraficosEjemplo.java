/*GraficosEjemplo.java
Marcelo Leonel Noguera
29/04/2017
- gráficos
*/
import java.awt.Graphics;
import javax.swing.JPanel;
public class GraficosEjemplo extends JPanel
{
	//se llama cuando se inicia la primera vez, cuando se maximiza y cuando se destapa
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); //llamar primero
		int ancho = getWidth();
		int largo = getHeight();
		
		g.drawLine(0,largo/2, ancho,largo/2);
		g.drawLine(ancho/2,0, ancho/2,largo);

		int cantidadDePorciones = 20;
		int parteAncho = ancho/cantidadDePorciones;
		int parteLargo = largo/cantidadDePorciones;

		for(int j=0;j<cantidadDePorciones/2;j++)
		{
			g.drawLine(ancho/2,largo-(parteLargo*j), (ancho/2)+(parteAncho*(j+1)),largo/2);
			g.drawLine(ancho/2,largo-(parteLargo*j), (ancho/2)-(parteAncho*(j+1)),largo/2);
			g.drawLine(ancho/2,parteLargo*j, ancho/2+(parteAncho*(j+1)),largo/2);
			g.drawLine(ancho/2,parteLargo*j, ancho/2-(parteAncho*(j+1)),largo/2);
		}
	}
}