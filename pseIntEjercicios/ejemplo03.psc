Proceso decision2
	Definir numero1,numero2,suma, resta, multiplicacion Como Entero;
	Definir division Como Real;
	Definir char Como Caracter;
	
	Escribir 'Ingresar dos numeros entero: ';
	Leer numero1;
	Leer numero2;
	
	Escribir "Ingrese caracter: ";
	Leer char;
	
	Si char = 's' Entonces
		Escribir numero1 + numero2;
	Sino
		Si char = 'r' Entonces
			Escribir numero1 - numero2;
		Sino
			Si char = 'm' Entonces
				Escribir numero1 * numero2;
			Sino	
				Si char = 'd' Entonces
					Escribir  numero1 / numero2;
				Sino
					Escribir "Dato no valido";
				FinSi
			FinSi
		FinSi
	FinSi
	
FinProceso
