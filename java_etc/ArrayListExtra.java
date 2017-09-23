/* ArrayListExtra.java
Marcelo Leonel Noguera
23/05/2017
Clase para manejar los ArrayList en caso de ser complicado usar los métodos que ya tiene
*/
import java.util.ArrayList;
public class ArrayListExtra {
	private String dato;
	private int indice = -2;
	private boolean bool = false;

	public ArrayListExtra()
	{
		//
	}

	//.indexOf("pepe") -- devuelve el index de la primera ocurrencia
	//.indiceDe() -- mi versión de eso
	public int indiceDe(String dato, ArrayList <AlfabetoGriego> lista)
	{
		for (int x=0;x<lista.size();x++)
		{
			if(dato==lista.get(x).getLetra())
			{
				indice = x;
			}
		}
		return indice;
	}

	//.contains("pepe") -- true o false según esté o no
	//.contiene("pepe") -- mi versión de eso
	public boolean contiene(String dato, ArrayList <AlfabetoGriego> lista)
	{
		for (int x=0;x<lista.size();x++)
		{
			if(dato==lista.get(x).getLetra())
			{
				bool = true;
			}
		}
		return bool;
	}

}