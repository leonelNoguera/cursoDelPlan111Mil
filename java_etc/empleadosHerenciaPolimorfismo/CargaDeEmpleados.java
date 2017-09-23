/*CargaDeEmpleados.java
Marcelo Leonel Noguera
01/07/2017
- gráficos
*/
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
public class CargaDeEmpleados extends JFrame implements ActionListener
{
	private JTextField campo1, campo2, campo3;
	private JButton botonEnviar;
	public Empleado empleado;

	public CargaDeEmpleados()
	{
		super("Carga de empleados");
		setLayout(new FlowLayout());
		
		//String nombre, String apellido, int cuil
		campo1 = new JTextField("Ingrese nombre",21);
		campo2 = new JTextField("Ingrese apellido",21);
		campo3 = new JTextField("Ingrese CUIL",21);

		botonEnviar = new JButton("Enviar");

		add(campo1);
		add(campo2);
		add(campo3);
		//add(botonEnviar);

		campo1.addActionListener(this);
		campo2.addActionListener(this);
		campo3.addActionListener(this);
		//botonEnviar.addActionListener(this);


		empleado.setNombre(campo1.getText());
		empleado.setApellido(campo2.getText());
		empleado.setCuil(Integer.parseInt(campo3.getText()));
		setEmpleado(empleado);
	}
	public void actionPerformed(ActionEvent evento)
	{
		empleado.setNombre(campo1.getText());
		empleado.setApellido(campo2.getText());
		empleado.setCuil(Integer.parseInt(campo3.getText()));
		setEmpleado(empleado);
		String texto = "";
		if(evento.getSource() == campo1)
		{
			//empleado.setNombre(campo1.getText());
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}
		if(evento.getSource() == campo2)
		{
			//empleado.setApellido(campo2.getText());
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}
		if(evento.getSource() == campo3)
		{
			//empleado.setCuil(Integer.parseInt(campo3.getText()));
			JOptionPane.showMessageDialog(null, String.format("texto: %s",evento.getActionCommand()));
		}
		/*if(evento.getSource() == botonEnviar)
		{
			JOptionPane.showMessageDialog(null, String.format("se precionó el boton y se enviaron los datos"));
			System.out.println(empleado);
		}*/
	}

	public Empleado getEmpleado()
	{
		return empleado;
	}
	public void setEmpleado(Empleado empleado)
	{
		this.empleado = empleado;
	}
}