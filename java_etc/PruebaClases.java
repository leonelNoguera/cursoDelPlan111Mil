/* PruebaClases.java
Marcelo Leonel Noguera
18/03/2017
Clase básica explicada por Nelson */
public class PruebaClases{
	public static void main(String[]args){
		Alumnos ivan = new Alumnos("Ivan","Suarez",21);
		System.out.print(ivan.informar());
		Alumnos nadie = new Alumnos();
		System.out.print(nadie.informar());
	}
}