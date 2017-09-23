/* ClaseScanner.java
Marcelo Leonel Noguera
25/03/2017
ejercicio de entrada con teclado*/
// Ingresar 10 numeros enteros y calcular la suma, el promedio, cantidad de pares, cantidad de positivos, cantidad de negativos, promedio de los ultimos 5.
public class ClaseScanner{
		private int pos=0;
		private int neg=0;
		private int par=0;
		private int suma=0;
		private double prom=0.0;
		private int contador=0;
		private int acumulador=0;
		private int contador2=0;
		private int acumulador2=0;
		private double promUltimos=0.0;

		public String informarResultados(){
			System.out.printf(" La suma es: %d",suma);
			System.out.printf("\n El promedio es: %f", prom);
			System.out.printf("\n Cantidad de pares: %d",par);
			System.out.printf("\n Cantidad de positivos: %d",pos);
			System.out.printf("\n Cantidad de negativos: %d",neg);
			System.out.printf("\n El promedio de los últimos 5 es: %f\n",promUltimos);

			String resultados = String.format(" La suma es: %d\n El promedio es: %f\n Cantidad de positivos: %d\n Cantidad de pares: %d\n Cantidad de negativos: %d\n El promedio de los últimos 5 es: %f\n",suma,prom,par,pos,neg,promUltimos);
			return resultados;
		}

		public void cantidadPositivos(int x){
			if(x>0){
				pos = pos + 1;
			}
		}
		public void cantidadNegativos(int x){
			if(x<0){
				neg = neg + 1;
			}
		}
		public void cantidadPares(int x){
			if((x%2)==0){
				par = par + 1;
			}
		}
		public void sumar(int x){
			suma = suma + x;
		}
		public void promedio(int x){
			acumulador = acumulador + x;
			contador = contador + 1;
			prom = (double)(acumulador/contador);
		}
		public void promedioUltimos(int x){
			acumulador2 = acumulador2 + x;
			promUltimos = (double)(acumulador2/5);
		}
	}