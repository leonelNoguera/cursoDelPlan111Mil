/*Etiquetas.java
Marcelo Leonel Noguera
01/07/2017
- gráficos
*/
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Etiquetas extends JFrame
{
	private JLabel etiqueta1, etiqueta2, etiqueta3, etiqueta4, etiqueta5;
	private Icon insecto;

	public Etiquetas()
	{
		super("Etiquetas con Java");
		setLayout(new FlowLayout());
		
		etiqueta1 = new JLabel("etiqueta1");
		etiqueta2 = new JLabel("etiqueta2");
		etiqueta3 = new JLabel("etiqueta3");

		insecto = new ImageIcon(getClass().getResource("imagenes/insectanim.gif"));
		etiqueta4 = new JLabel(insecto);
		etiqueta5 = new JLabel("un insecto",insecto, SwingConstants.LEFT);
		
		etiqueta1.setToolTipText("Ayuda");
		etiqueta4.setToolTipText("Un insecto");
		
		add(etiqueta1);
		add(etiqueta2);
		add(etiqueta3);
		add(etiqueta4);
		add(etiqueta5);
	}
}