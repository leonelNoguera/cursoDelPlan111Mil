/* Estudiante.java
Marcelo Leonel Noguera
06/05/2017
Crear un libro de calificaciones para 1 profesor, 1 materia y 3 pruebas con tema, fecha y nota.
- Ingreso de nota para cada prueba con su correspondiente fecha y tema
- promedio de calificaciones por prueba
- gráfico de barras por prueba
- promedio final por alumno
- gráfico de barras por aprobados y desaprobados
*/
public class Estudiante
{
	private double notaPrueba;
	private String materia;
	private String nombre;
	private String apellido;

	public void setNotaPrueba(double notaPrueba)
	{
		this.notaPrueba = notaPrueba;
	}
	public double getNotaPrueba()
	{
		return notaPrueba;
	}
	public void setMateria(Materia materia)
	{
		this.materia = materia.getNombre();
	}
	public String getMateria()
	{
		return materia;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	public String getApellido()
	{
		return apellido;
	}

	public Estudiante(String nombre, String apellido, Materia materia, double notaPrueba)
	{
		setNotaPrueba(notaPrueba);
		setMateria(materia);
		setNombre(nombre);
		setApellido(apellido);
	}
}