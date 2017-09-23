/* LibroCalificacionesPrueba.java
Marcelo Leonel Noguera
22/04/2017
Crear un libro de calificaciones para 1 profesor, 1 materia y 3 pruebas con tema, fecha y nota.
- Ingreso de nota para cada prueba con su correspondiente fecha y tema
- promedio de calificaciones por prueba
- gráfico de barras por prueba
- promedio final por alumno
- gráfico de barras por aprobados y desaprobados

Calificaciones
estudiante 1: 84
estudiante 2: 10
estudiante 10: 4

Promedio del curso: 43.22
nota mayor: 100.00
nota menor: 10.00

Gráfico de barras
00-09: *
10-19: **

*/
import java.util.Random;
import java.util.ArrayList;
public class LibroCalificacionesPrueba
{
	static ArrayList <Estudiante> listaDeEstudiantes;
	
	// genera notas aleatorias con un rango de 0 a 100, retorna una por vez
	public static double bateriaDeDatosDeNotas() 
	{	
		double nota=new Random().nextInt(100);
		return nota;
	}

	public static void main(String[]args)
	{
		listaDeEstudiantes = new ArrayList <Estudiante>();

		// la clase Materia tiene un control de errores que lanza error en caso de que no esté registrada la materia
		Materia materia = new Materia("Laboratorio de programación");

		// firma: Estudiante(String nombre, String apellido, Materia materia, double notaPrueba)
		listaDeEstudiantes.add(new Estudiante("Matias","Blacutt",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Ivan","Suarez",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Marcelo","Noguera",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Alejandro","Belo",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Cristian","Cortes",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Matias","Cortes",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Ivan","Belo",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Marcelo","Suarez",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Alejandro","Blacutt",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));
		listaDeEstudiantes.add(new Estudiante("Cristian","Suarez",new Materia("Laboratorio de programación"),bateriaDeDatosDeNotas()));

		Libro libro = new Libro();

		// firma: obtenerInforme(ArrayList <Estudiante> lista)
		System.out.println(libro.obtenerInforme(listaDeEstudiantes));
	}
}