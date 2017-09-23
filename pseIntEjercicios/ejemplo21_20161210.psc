Proceso notas_promedios
	Definir nombres, cadenaAux Como Cadena;
	Definir tam, x, nota1, j, nota2, nota3, contA, contR Como Entero;
	Definir notas Como Real;
	tam=4;
	contA=0;
	contR=0;
	Dimension nombres(tam), notas(tam);
	
	Para x<-0 Hasta tam-1 Con Paso 1 Hacer
		Escribir "ingrese nombre: ";
		Leer nombres[x];
		
		Escribir "ingrese notas: ";
		Leer nota1;
		Leer nota2;
		Leer nota3;
		
		notas[x]=(nota1+nota2+nota3)/3;
		
	FinPara
	
	Para x<-0 Hasta tam-1 Con Paso 1 Hacer
		Escribir "----";
		Escribir nombres[x];
		Escribir notas[x];
		Si notas[x]>=7 Entonces
			Escribir "aprobado";
			contA=contA+1;
		Sino
			Escribir "no aprobado";
			contR=contR+1;
		FinSi
	FinPara
	Escribir "----";
	Escribir "Hay",contA," aprobado/s";
	Escribir "Hay",contR," reprobado/s";	
FinProceso
