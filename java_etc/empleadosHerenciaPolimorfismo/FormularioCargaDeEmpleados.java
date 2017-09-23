/*FormularioCargaDeEmpleados.java
Marcelo Leonel Noguera
01/07/2017
- gráficos
*/
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
public class FormularioCargaDeEmpleados extends JFrame implements ActionListener
{
	private JTextField campoNombre, campoApellido, campoCuil;
	private JButton botonEnviar;

	public FormularioCargaDeEmpleados()
	{
		super("Carga de empleados por GUI");
		setLayout(new FlowLayout());
		
		campoNombre = new JTextField("Nombre",21);
		campoApellido = new JTextField("Apellido",21);
		campoCuil = new JTextField("Cuil",21);
		botonEnviar = new JButton("Enviar datos");

		add(campoNombre);
		add(campoApellido);
		add(campoCuil);
		add(botonEnviar);
		
		campoNombre.addActionListener(this);
		campoApellido.addActionListener(this);
		campoCuil.addActionListener(this);

		botonEnviar.setActionCommand("enable");
	}
	public void actionPerformed(ActionEvent evento)
	{
		/*String texto = "";
		if(evento.getSource() == campoNombre)
		{
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}
		if(evento.getSource() == campoApellido)
		{
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}
		if(evento.getSource() == campoCuil)
		{
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}*/
		if ("enable".equals(evento.getActionCommand()))
		{
	        //b2.setEnabled(false);
	        System.out.println("------------------------------------------------------------------------");
	    }
	}
}