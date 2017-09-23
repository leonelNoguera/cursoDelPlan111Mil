/* Profesor.java
Marcelo Leonel Noguera
19/08/2017
*/
package clases;

public class Profesor extends Persona {

    private String cargo;

    private String materia;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "cargo=" + cargo + ", materia=" + materia + '}';
    }

    

    public Profesor(String cargo, String materia, String nombre, String apellido, int dni, String email) {
        super(nombre, apellido, dni, email);
        this.cargo = cargo;
        this.materia = materia;
    }
    public Profesor(){}
}
