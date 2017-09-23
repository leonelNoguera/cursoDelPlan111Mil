/* Cliente.java
Marcelo Leonel Noguera
19/08/2017*/
package clases;

public class Cliente {

    private int cuitCuil;

    private String nombre;

    private String apellido;

    public Cliente(int cuitCuil, String nombre, String apellido) {
        this.cuitCuil = cuitCuil;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCuitCuil() {
        return cuitCuil;
    }

    public void setCuitCuil(int cuitCuil) {
        this.cuitCuil = cuitCuil;
    }

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
   
}