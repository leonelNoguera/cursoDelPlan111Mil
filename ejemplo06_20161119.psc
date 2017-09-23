// 1_ Ingresar 10 numeros enteros e informar cuantos ceros se ingresaron
// 2_ Ingresar 10 numeros enteros e informar cuantos positivos se ingresaron
// 3_ Ingresar 10 numeros enteros e informar cuantos positivos y cuantos negativos se ingresaron
// 4_ Ingresar 10 numeros enteros e informar el promedio de los positivos
// 5_ Imprimir los numeros pares entre 10 y 40
// 6_ Ingresar 10 numeros enteros e informar cuantos pares e impares se ingresaron
// 7_ Imprimir la tabla de multiplicacion de 1 a 10

Proceso repeticiones
	Definir numero1, resultado7, x, resultadoSumPositivos, xPos4, xPos3, xNeg3, resultadoSumCeros, xCeros, resultadoSumPositivos3, resultadoSumNegativos3, xPar6, xImpar6, xN7, y7 Como entero;
	Definir resultadoPromedioPositivos Como Real;
	Definir resultado7b, resultado7c Como Cadena;
	
	xPos4=0;
	xPos3=0;
	resultadoPromedioPositivos=0;
	resultadoSumCeros=0;
	xCeros=0;
	xPar6=0;
	xImpar6=0;
	xN7=0;
	resultado7b ='';
	resultado7c ='';
	
		Para x<-0 Hasta 4 Con Paso 1 Hacer
			Escribir 'Ingresar un numero entero: ';
			Leer numero1;
			
			// ---- 1 ----
			Si numero1==0 Entonces
				xCeros=xCeros+1;
			FinSi

			// ---- 2 y 3 ----
			Si numero1>0 Entonces
				xPos3=xPos3+1;
			Sino
				Si numero1<0 Entonces
					xNeg3=xNeg3+1;
				FinSi
			FinSi
			
			// ---- 4 ----
			Si numero1>0 Entonces
				xPos4=xPos4+1;
				resultadoSumPositivos=resultadoSumPositivos+numero1;
			Sino
				//nada
			FinSi
			
			// ---- 6 ----
			Si (numero1%2)=0 Entonces
				xPar6=xPar6+1;
			Sino
				xImpar6=xImpar6+1;
			FinSi
		FinPara
		//---- 1 ----
		Escribir 'Hay ',xCeros,' ceros.';
		//---- 2 y 3 ----
		Escribir 'Son ',xPos3,'positivos y ',xNeg3,' negativos.';
		// ---- 4 ----
		Si xPos4>0 Entonces
			resultadoPromedioPositivos=resultadoSumPositivos/xPos4;
		FinSi
		Escribir 'El resultado de ejercicio 4 es: ',resultadoPromedioPositivos;
		//---- 5 ----
		Escribir 'Numeros pares desde 10 a 40:';
		Para x<-10 Hasta 40 Con Paso 2 Hacer
			Escribir x;
		FinPara
		//---- 6 ----
		Escribir 'Son ',xPar6,'pares y ',xImpar6,' impares.';
		
		//---- 7 ----
		Escribir 'Tabla de multiplicacion desde 1 a 10:';
		
		Para y7<-1 Hasta 10 Con Paso 1 Hacer
			xN7=y7;
			Escribir xN7,' ',xN7*2,' ',xN7*3,' ',xN7*4,' ',xN7*5,' ',xN7*6,' ',xN7*7,' ',xN7*8,' ',xN7*9,' ',xN7*10,' ';
		FinPara
		
FinProceso

