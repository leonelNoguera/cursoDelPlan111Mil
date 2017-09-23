/* HerenciaUmlEjemplo.java
Marcelo Leonel Noguera
19/08/2017
*/
package herenciaUmlEjemplo;

import clases.Persona;
import clases.Alumno;
import clases.Profesor;
import java.util.Scanner;

public class HerenciaUmlEjemplo
{
    public static void main(String[] args)
    {
        String curso;
        String materiasInscriptas;
        String materiasAprobadas;
        String cargo;
        String materia;
        String nombre;
        String apellido;
        int dni;
        String email;
        //String nombre, String apellido, int dni, String email
        Persona persona1 = new Persona("Ivan","Suarez",40435312,"nitlahak@gmail.com");
        Persona persona2 = new Persona("Federico","Duschak",41425132,"iviydarken@gmail.com");
        //String curso, String materiasInscriptas, String materiasAprobadas, String nombre, String apellido, int dni, String email
        Alumno alumno1 = new Alumno("2°b","programación I, inglés","inglés","Ivan","Suarez",40435312,"nitlahak@gmail.com");
        Alumno alumno2 = new Alumno("2°c","matemática I, sistemas operativos","matemática I","Federico","Duschak",41425132,"iviydarken@gmail.com");
        //String cargo, String materia, String nombre, String apellido, int dni, String email
        Profesor profesor1 = new Profesor("profesor","inglés","Ivan","Suarez",40435312,"nitlahak@gmail.com");
        Profesor profesor2 = new Profesor("profesor","matemática I","Federico","Duschak",41425132,"iviydarken@gmail.com");

        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s",persona1,persona2,alumno1,alumno2,profesor1,profesor2);
    }
}