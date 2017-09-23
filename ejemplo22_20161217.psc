
SubProceso mostrarD(puntero Por Referencia,tam Por Valor)
	Definir x Como Entero;
	Para x<-0 Hasta tam-1 Con Paso 1 Hacer
		Escribir puntero[x];
	FinPara
FinSubProceso

SubProceso cargarD(puntero Por Referencia,tam por valor)
	Definir x Como Entero;
	Para x<-0 Hasta tam-1 Con Paso 1 Hacer
		Leer puntero[x];
	FinPara
FinSubProceso

Proceso funciones
	//3 vectores de igual tipo y distinto tamaño
	//3 vectores de distinto tipo y distinto tamaño
	
	Definir tam, tam0, tam1 Como Entero;
	
	tam=5;
	tam0=4;
	tam1=3;
	
	Definir v Como Caracter;
	Dimension v(tam);
	Definir v0 Como Entero;
	Dimension v0(tam0);
	Definir v1 Como Real;
	Dimension v1(tam1);
	
	Escribir "--caracter--";
	cargarD(v,tam);
	Escribir "--entero--";
	cargarD(v0,tam0);
	Escribir "--real--";
	cargarD(v1,tam1);
	
	Escribir "--caracter--";
	mostrarD(v,tam);
	Escribir "--entero--";
	mostrarD(v0,tam0);
	Escribir "--real--";
	mostrarD(v1,tam1);
	
FinProceso
