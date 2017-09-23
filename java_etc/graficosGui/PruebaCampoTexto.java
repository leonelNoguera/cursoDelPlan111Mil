/*PruebaCampoTexto.java
Marcelo Leonel Noguera
01/07/2017
- gráficos
*/
import javax.swing.JFrame;
public class PruebaCampoTexto
{
	public static void main(String[]args)
	{
		CampoTexto campoTexto = new CampoTexto();
		campoTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		campoTexto.setSize(350,350);
		campoTexto.setVisible(true);
	}
}