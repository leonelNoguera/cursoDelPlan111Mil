// Este codigo ha sido generado por el modulo psexport 20160506-l64 de PSeInt.
// Es posible que el codigo generado no sea completamente correcto. Si encuentra
// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

#include<iostream>
using namespace std;

// En C++ no se puede dimensionar un arreglo estático con una dimensión no constante.
// PSeInt sobredimensionará el arreglo utilizando un valor simbólico ARREGLO_MAX.
// Sería posible crear un arreglo dinámicamente con los operadores new y delete, pero
// este mecanismo aún no está soportado en las traducciones automáticas de PSeInt.
#define ARREGLO_MAX 100

// Para leer variables de texto se utiliza el operador << del objeto cin, que
// lee solo una palabra. Para leer una linea completa (es decir, incluyendo los
// espacios en blanco) se debe utilzar getline (ej, reemplazar cin>>x por
// getline(cin,x)), pero obliga a agregar un cin.ignore() si antes del getline
// se leyó otra variable con >>.

int main() {
	int aux;
	int contador;
	int contador2;
	int j;
	int tam;
	int vector[ARREGLO_MAX];
	int vector2[ARREGLO_MAX];
	int x;
	tam = 4;
	j = 0;
	contador = 0;
	contador2 = 0;
	for (x=0;x<=tam-1;x++) {
		cout << "ingrese numero: " << endl;
		cin >> vector[x];
		vector2[x] = vector[x];
	}
	while (j==0) {
		j = 1;
		for (x=0;x<=tam-2;x++) {
			if (vector[x]<vector[x+1]) {
				aux = vector[x];
				vector[x] = vector[x+1];
				vector[x+1] = aux;
				j = 0;
			}
			contador = contador+1;
		}
	}
	for (x=0;x<=tam-2;x++) {
		for (x=0;x<=tam-2;x++) {
			if (vector2[x]<vector2[x+1]) {
				aux = vector2[x];
				vector2[x] = vector2[x+1];
				vector2[x+1] = aux;
			}
			contador2 = contador2+1;
		}
	}
	for (x=0;x<=tam-1;x++) {
		cout << vector[x] << endl;
	}
	cout << ("----") << endl;
	for (x=0;x<=tam-1;x++) {
		cout << vector2[x] << endl;
	}
	cout << ("----") << endl;
	cout << contador << endl;
	cout << contador2 << endl;
	cout << ("----") << endl;
	return 0;
}

