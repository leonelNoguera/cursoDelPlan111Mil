/* Materia.java
Marcelo Leonel Noguera
22/04/2017
Crear un libro de calificaciones para 1 profesor, 1 materia y 3 pruebas con tema, fecha y nota.
- Ingreso de nota para cada prueba con su correspondiente fecha y tema
- promedio de calificaciones por prueba
- gráfico de barras por prueba
- promedio final por alumno
- gráfico de barras por aprobados y desaprobados
*/
public class Materia
{
	private String nombre;
	public void setNombre(String nombre)
	{
		boolean bandera = false;
		String []nombres = {"Laboratorio de programación","Seguridad informática","Matemática","Literatura"};
		for(int x=0;x<nombres.length;x++)
		{
			if(new String(nombres[x]).equals(nombre))
			{
				this.nombre = nombres[x];
				bandera = true;
			}
			else {}
		}
		if(bandera == false)
		{
			throw new IllegalArgumentException(String.format("La materia '%s' no está registrada o está mal escrita.",nombre));
		}
		else {}
	}
	public String getNombre()
	{
		return nombre;
	}

	public Materia(String nombre)
	{
		setNombre(nombre);
	}
}