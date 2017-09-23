Proceso ejemplo08
	Definir n1,f,resPromedio,x Como Entero;
	x=0;
	f=0;
	resPromedio=0;
	n1=0;
	Definir car Como Caracter;
	Definir resContCar Como Entero;
	resContCar=0;
	//---- 1 y 2 ----
	//ingresar caracteres e informar cuantas vocales se ingresaron, terminar con caracter vacio
	
	Escribir "Ingrese caracteres: ";
	Repetir
		Leer car;
		Si car==' ' Entonces
			x=1;
		Sino
			Si car=='a' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='e' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='i' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='o' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='u' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='A' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='E' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='I' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='O' Entonces
				resContCar=resContCar+1;
			FinSi
			Si car=='U' Entonces
				resContCar=resContCar+1;
			FinSi
		FinSi
	Hasta Que x==1
	
	x=0;
	
	Escribir resContCar;
	//---- 3 ----
	//ingresar numeros positivos y mostrar su promedio, salir con numero negativo
	Escribir "Ingrese números: ";
	Mientras x==0 Hacer
		Leer n1;
		Si n1<0 Entonces
			x=1;
		Sino
			resPromedio=resPromedio+n1;
			f=f+1;
		FinSi
 	FinMientras
	Si f>0 Entonces
		Escribir resPromedio/f;
	FinSi
FinProceso
