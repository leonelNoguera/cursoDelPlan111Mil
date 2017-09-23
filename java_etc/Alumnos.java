/* Alumnos.java
Marcelo Leonel Noguera
18/03/2017
Clase básica explicada por Nelson */
public class Alumnos{
	private String primerNombre;
	private String apellidoPaterno;
	private int edadAlumno;

	// constructor que recibe parametros
	public Alumnos(String nombre,String apellido, int edad){
		setPrimerNombre(nombre);
		setApellidoPaterno(apellido);
		setEdadAlumno(edad);
	}
	// constructor por defecto
	public Alumnos(){
		setPrimerNombre("Predeterminado");
		setApellidoPaterno("Predeterminado");
		setEdadAlumno(0);
	}

	public void setPrimerNombre(String nombre){
		primerNombre = nombre;
	}
	public String getPrimerNombre(){
		return primerNombre;
	}
	public void setApellidoPaterno(String apellido){
		apellidoPaterno = apellido;
	}
	public String getApellidoPaterno(){
		return apellidoPaterno;
	}
	public void setEdadAlumno(int edad){
		edadAlumno = edad;
	}
	public int getEdadAlumno(){
		return edadAlumno;
	}
	public String informar(){
		String informe = String.format("Nombre: %s \nApellido paterno: %s \nEdad: %d \n",
			getPrimerNombre(),getApellidoPaterno(),getEdadAlumno());
		return informe;
	}
}
/*Alumnos ivan = new Alumnos();
ivan.setPrimerNombre("Ivan");
ivan.setApellidoPaterno("Suarez");
ivan.setEdadAlumno(21);*/