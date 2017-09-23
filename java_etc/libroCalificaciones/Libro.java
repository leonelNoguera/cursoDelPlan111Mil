/* Libro.java
Marcelo Leonel Noguera
22/04/2017
Crear un libro de calificaciones para 1 profesor, 1 materia y 3 pruebas con tema, fecha y nota.
- Ingreso de nota para cada prueba con su correspondiente fecha y tema
- promedio de calificaciones por prueba
- gráfico de barras por prueba
- promedio final por alumno
- gráfico de barras por aprobados y desaprobados
*/
import java.util.ArrayList;
public class Libro
{
  // este método aún no funciona bien, en ocasiones sobra un asterisco
  public static String obtenerInformeGraficoDeBarras(ArrayList <Estudiante> lista)
  {
    String []asteriscos = {"","","","","","","","","",""};
    
    for(int x=0;x<lista.size();x++)
    {
      for(int j=0;j<100;j+=10)
      {
        if(lista.get(x).getNotaPrueba()>=j)
        {
          if(lista.get(x).getNotaPrueba()<(j+10))
          {
            asteriscos[j/10] += "*";
          }
        }
      }
      if(lista.get(x).getNotaPrueba()>=90)
      {
        asteriscos[9] += "*";
      }
    }
    return String.format("Gráfico de barras:\n 00-09:  %s\n 10-19:  %s\n 20-29:  %s\n 30-39:  %s\n 40-49:  %s\n 50-59:  %s\n 60-69:  %s\n 70-79:  %s\n 80-89:  %s\n 90-100: %s",asteriscos[0],asteriscos[1],asteriscos[2],asteriscos[3],asteriscos[4],asteriscos[5],asteriscos[6],asteriscos[7],asteriscos[8],asteriscos[9]);
  }
  
  public String obtenerInformeNotaMayor(ArrayList <Estudiante> lista)
  {
    double notaTomada = lista.get(0).getNotaPrueba();

    for(int x=0;x<lista.size();x++)
    {
      if(lista.get(x).getNotaPrueba()>notaTomada)
      {
        notaTomada = lista.get(x).getNotaPrueba();
      }
    }
    return String.format("Nota mayor:  %f",notaTomada);
  }

  public String obtenerInformeNotaMenor(ArrayList <Estudiante> lista)
  {
    double notaTomada = lista.get(0).getNotaPrueba();

    for(int x=0;x<lista.size();x++)
    {
      if(lista.get(x).getNotaPrueba()<notaTomada)
      {
        notaTomada = lista.get(x).getNotaPrueba();
      }
    }
    return String.format("Nota menor:  %f",notaTomada);
  }

  public String obtenerInformePromedioDelCurso(ArrayList <Estudiante> lista)
  {
    double suma = 0;
    String stringInformePromedioDelCurso;
    for(int x=0;x<lista.size();x++)
    {
      suma += lista.get(x).getNotaPrueba();  
    }
  	stringInformePromedioDelCurso = String.format("Promedio del curso:  %f",suma/lista.size());
  	return stringInformePromedioDelCurso;
  }

  public String obtenerInformeCalificaciones(ArrayList <Estudiante> lista)
  {
    String stringInformeCalificaciones = "Calificaciones:";
    for(int x=0;x<lista.size();x++)
    {
      stringInformeCalificaciones += String.format("\n estudiante : %s %s\n nota:        %f\n materia:     %s\n",lista.get(x).getNombre(),lista.get(x).getApellido(),lista.get(x).getNotaPrueba(),lista.get(x).getMateria());
    }
  	return stringInformeCalificaciones;
  }

  // devuelve el informe de todo el libro
  public String obtenerInforme(ArrayList <Estudiante> lista)
  {
    return String.format("\n%s\n%s\n\n%s\n\n%s\n\n%s\n",obtenerInformeCalificaciones(lista),obtenerInformePromedioDelCurso(lista),obtenerInformeNotaMayor(lista),obtenerInformeNotaMenor(lista),obtenerInformeGraficoDeBarras(lista));
  }
}