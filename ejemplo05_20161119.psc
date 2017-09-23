// 1_ Ingresar 3 caracteres - orden alfabetico
// 2_ Ingresar 3 caracteres - orden alfabetico inverso
// 3_ Ingresar 3 palabras - orden alfabetico
// 4_ Ingresar 3 palabras - orden alfabetico inverso
// 5_ Ingresar 5 enteros y ordenarlos

Proceso optionsSegun
	Definir option,numero1,numero2 Como Entero;
	Escribir 'Ingresar dos numeros entero: ';
	Leer numero1;
	Leer numero2;
	Escribir 'Ingresar la operacion: ';
	Leer option;
	
	Segun option Hacer
		1:
			Escribir 'La suma es: ',numero1+numero2;
		2:
			Escribir 'La resta es: ',numero1-numero2;
		3:
			Escribir 'La multiplicacion es: ',numero1*numero2;
		4:
			Escribir 'La division es: ',numero1/numero2;
		De Otro Modo:
			Escribir 'Dato errroneo.';
	FinSegun
FinProceso

