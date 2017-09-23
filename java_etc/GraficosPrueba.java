/*GraficosPrueba.java
Marcelo Leonel Noguera
29/04/2017
- gráficos
*/
import javax.swing.JFrame;
public class GraficosPrueba extends GraficosEjemplo
{
	public static void main(String[]args)
	{
		JFrame aplicacion = new JFrame();
		GraficosPrueba graficosPrueba = new GraficosPrueba();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.add(graficosPrueba);
		aplicacion.setSize(350,350);
		aplicacion.setVisible(true);
	}
}