package clases;

public class Alumno extends Persona {

    private String curso;

    private String materiasInscriptas;

    private String materiasAprobadas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasInscriptas(String materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    public String getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(String materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    @Override
    public String toString()
    {
        //String curso, String materiasInscriptas, String materiasAprobadas, String nombre, String apellido, int dni, String email
        return String.format("Alumno:\n   curso: %s\n   materias inscriptas: %s\n   materias aprobadas: %s\n   nombre: %s\n   apellido: %s\n   dni: %d\n   email: %s\n",curso,materiasInscriptas,materiasAprobadas,nombre,apellido,dni,email);
    }

    

    public Alumno(String curso, String materiasInscriptas, String materiasAprobadas, String nombre, String apellido, int dni, String email)
    {
        super(nombre, apellido, dni, email);
        this.curso = curso;
        this.materiasInscriptas = materiasInscriptas;
        this.materiasAprobadas = materiasAprobadas;
    }
    public Alumno(){}
   
}
