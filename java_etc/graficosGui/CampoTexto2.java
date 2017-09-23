/*CampoTexto2.java
Marcelo Leonel Noguera
01/07/2017
- gráficos
*/
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
public class CampoTexto2 extends JFrame implements ActionListener
{
	private JTextField campo1, campo2, campo3;

	public CampoTexto2()
	{
		super("Campos de texto con Java");
		setLayout(new FlowLayout());
		
		campo1 = new JTextField();
		campo2 = new JTextField("Ingrese texto",21);
		campo3 = new JTextField("No se puede editar");
		campo3.setEditable(false);

		add(campo1);
		add(campo2);
		add(campo3);
		//ActionEvent evento = new ActionEvent();
		campo1.addActionListener(this);
		//campo2.addActionListener(manejador);
		//campo3.addActionListener(manejador);
	}
	public void actionPerformed(ActionEvent evento)
	{
		String texto = "";
		if(evento.getSource() == campo1)
		{
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}
		/*if(evento.getSource() == campo2)
		{
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}
		if(evento.getSource() == campo3)
		{
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}*/
	}
}