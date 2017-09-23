/* Numeros.java
Marcelo Leonel Noguera
18/03/2017
ejercicio de números complejos*/
public class Numeros{
	public static void main(String[]args){
		NumerosComplejos z1 = new NumerosComplejos(2,1);
		System.out.print(z1.informar());
		NumerosComplejos z2 = new NumerosComplejos(4,3);
		System.out.print(z2.informar());

		NumerosComplejos z3 = new NumerosComplejos();
		System.out.print(z3.sumar(z1,z2));
	}
}