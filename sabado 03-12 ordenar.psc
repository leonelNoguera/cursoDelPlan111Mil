Proceso sin_titulo
	Definir vector, x, tam, aux, j, vector2, contador, contador2, minimo, vector3,k, contador3, maximo Como Entero;
	tam=4;
	Dimension vector(tam), vector2(tam), vector3(tam);
	j=0;
	k=0;
	contador=0;
	contador2=0;
	contador3=0;
	
	
	Para x<-0 Hasta tam-1 Con Paso 1 Hacer
		Escribir "ingrese numero: ";
		Leer vector[x];
		vector2[x] = vector[x];
		vector3[x] = vector[x];
	FinPara
	
	Mientras j==0 Hacer
		j=1;
		Para x<-0 Hasta tam-2 Con Paso 1 Hacer
			Si vector[x]<vector[x+1] Entonces
				aux=vector[x];
				vector[x]=vector[x+1];
				vector[x+1]=aux;
				j=0;
			FinSi
			contador=contador+1;
		FinPara
	FinMientras
	
	Para x<-0 Hasta tam-2 Con Paso 1 Hacer
		Para x<-0 Hasta tam-2 Con Paso 1 Hacer
			Si vector2[x]<vector2[x+1] Entonces
				aux=vector2[x];
				vector2[x]=vector2[x+1];
				vector2[x+1]=aux;
			FinSi
			contador2=contador2+1;
		FinPara
	FinPara
	
	j=0;
	
	Para k<-0 Hasta tam-2 Con Paso 1 Hacer

		Para x<-k Hasta tam-2 Con Paso 1 Hacer
			
			Si vector3[k]<vector3[x+1] Entonces
				aux=vector3[k];
				vector3[k]=vector3[x+1];
				vector3[x+1]=aux;
				
			FinSi
			
			contador3=contador3+1;
			
		FinPara
		k=k+1;
	FinPara
	
	
	Para x<-0 Hasta tam-1 Con Paso 1 Hacer
		escribir vector[x];
	FinPara
	Escribir ("----");
	Para x<-0 Hasta tam-1 Con Paso 1 Hacer
		escribir vector2[x];
	FinPara
	Escribir ("----");
	Para x<-0 Hasta tam-1 Con Paso 1 Hacer
		escribir vector3[x];
	FinPara
	
	Escribir ("----");
	Escribir contador;
	Escribir contador2;
	Escribir contador3;
	Escribir ("----");
	
FinProceso
