/* PruebaScanner.java
Marcelo Leonel Noguera
25/03/2017
ejercicio de entrada con teclado*/
// Ingresar 10 numeros enteros y calcular la suma, el promedio, cantidad de pares, cantidad de positivos, cantidad de negativos, promedio de los ultimos 5.
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PruebaScanner{
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		ClaseScanner ejemplo = new ClaseScanner();

		for(int f=0;f<=9;f++){
			int x = entrada.nextInt();
			ejemplo.cantidadPositivos(x);
			ejemplo.sumar(x);
			ejemplo.promedio(x);
			ejemplo.cantidadNegativos(x);
			ejemplo.cantidadPares(x);
			if(f>4){
				ejemplo.promedioUltimos(x);
			}
		}
		JOptionPane.showMessageDialog(null,ejemplo.informarResultados());
	}
}