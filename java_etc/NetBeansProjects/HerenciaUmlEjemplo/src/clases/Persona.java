/* Persona.java
Marcelo Leonel Noguera
19/08/2017
*/
package clases;

public class Persona {

    private String nombre;

    private String apellido;

    private int dni;

    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return String.format("Persona:\n   nombre: %s\n   apellido: %s\n   dni: %d\n   email: %s\n",nombre,apellido,dni,email);
    }

    public Persona(String nombre, String apellido, int dni, String email)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
    }
    public Persona(){}
}
