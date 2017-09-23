/*Ejercicio62Prueba.java
Marcelo Leonel Noguera
29/04/2017
- gráficos
*/
import javax.swing.JFrame;
public class Ejercicio62Prueba extends Ejercicio62
{
	public static void main(String[]args)
	{
		JFrame aplicacion = new JFrame();
		Ejercicio62Prueba graficosPrueba = new Ejercicio62Prueba();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.add(graficosPrueba);
		aplicacion.setSize(350,350);
		aplicacion.setVisible(true);
	}
}