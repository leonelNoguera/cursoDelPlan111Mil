/* CalificacionBarPrueba.java
Marcelo Leonel Noguera
22/04/2017

Se pide a 20 estudiantes de Almafuerte que califiquen la calidad de comida en el bar de Gaby en una escala de 1 a 5 donde 1 es pésimo y 5 es bueno, colocar las 20 respuestas en un array de enteros y determine la frequencia de cada calificación. Realizar el gráfico de barras. Nota: El primer caso se resuelve con lista de inicialización.
caso 1: ingresar 20 valores con lista de inicialización
caso 2: lo mismo con números aleatorios
caso 3: utilizar una GUI de entrada.
*/
public class CalificacionBarPrueba
{
	public static void main(String[]args)
	{
		CalificacionBar primerCaso = new CalificacionBar();
		primerCaso.listaInicializacion();
		
		for (int x=1;x<6;x++)
		{
			System.out.println(primerCaso.vectorCalificaciones[x]);
		}
		System.out.println();
		
		/*CalificacionBar segundoCaso = new CalificacionBar();
		segundoCaso.numerosAleatorios();

		for (int x=1;x<6;x++)
		{
			System.out.println(segundoCaso.vectorCalificaciones[x]);
		}*/

		CalificacionBar tercerCaso = new CalificacionBar();
		tercerCaso.entradaGui();

		for (int x=1;x<6;x++)
		{
			System.out.println(tercerCaso.vectorCalificaciones[x]);
		}
	}
}