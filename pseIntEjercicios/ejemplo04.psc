// 1_ Ingresar 3 enteros e informar el mas grande
// 2_ Ingresar 3 enteros e informarlos de mayor a menor
// 3_ ¿Qué sucederia si fueran caracteres?
Proceso numerosOrden
	
	// ------------ Punto 1 ------------ //
	// --------------------------------- //
	
	Escribir 'Ingresar tres numeros enteros: ';
	Definir numero1,numero2,numero3 Como Entero;
	Leer numero1;
	Leer numero2;
	Leer numero3;
	
	Si numero1>numero2 Entonces
		Si numero1>numero3 Entonces
			Escribir 'El mayor es: ',numero1;
		Sino
			Si numero3>numero1 Entonces
				Escribir 'El mayor es: ',numero3;
			FinSi
		FinSi
	Sino
		Si numero2>numero1 Entonces
			Si numero2>numero3 Entonces
				Escribir 'El mayor es: ',numero2;
			Sino
				Si numero3>numero2 Entonces
					Escribir 'El mayor es: ',numero3;
				FinSi
			FinSi
		Sino
			Si numero3>numero1 Entonces
				Si numero3>numero2 Entonces
					Escribir 'El mayor es: ',numero3;
				FinSi
			FinSi
		FinSi
	FinSi
	
	// ------------ Punto 2 ------------ //
	// --------------------------------- //
	
	Si numero1>numero2 Entonces
		Si numero1>numero3 Entonces
			Escribir '- ',numero1;
			Si numero2>numero3 Entonces
				Escribir '-- ',numero2;
				Escribir '--- ',numero3;
			Sino
				Escribir '-- ',numero3;
				Escribir '--- ',numero2;
			FinSi
		Sino
			Si numero3>numero1 Entonces
				Escribir '- ',numero3;
				Escribir '-- ',numero1;
				Escribir '--- ',numero2;
			FinSi
		FinSi
	Sino
		Si numero2>numero1 Entonces
			Si numero2>numero3 Entonces
				Escribir '- ',numero2;
				Si numero1>numero3 Entonces
					Escribir '-- ',numero1;
					Escribir '--- ',numero3;
				Sino
					Escribir '-- ',numero3;
					Escribir '--- ',numero1;
				FinSi
			Sino
				Si numero3>numero2 Entonces
					Escribir '- ',numero3;
					Escribir '-- ',numero2;
					Escribir '--- ',numero1;
				FinSi
			FinSi
		Sino
			Si numero3>numero1 Entonces
				Si numero3>numero2 Entonces
					Escribir '- ',numero3;
					Si numero1>numero2 Entonces
						Escribir '-- ',numero1;
						Escribir '--- ',numero2;
					Sino
						Escribir '-- ',numero2;
						Escribir '--- ',numero1;
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso

