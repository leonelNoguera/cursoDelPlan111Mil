/*ForMejorado.java
Marcelo Leonel Noguera
29/04/2017
- for mejorado
*/
import javax.swing.JOptionPane;
public class ForMejorado
{
	public static void main(String[]args)
	{
		String palabra = "";
		String []vectorPalabras = new String[10];
		String palabrasUnidas = "";
		for (int x=0;x<10;x++)
		{
			vectorPalabras[x] = JOptionPane.showInputDialog("Ingrese algo:");
		}
		for(String indice:vectorPalabras)
		{
			palabrasUnidas += (" - " + indice);
		}
		JOptionPane.showMessageDialog(null,palabrasUnidas);
	}
}