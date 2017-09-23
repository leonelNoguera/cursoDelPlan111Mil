/* PruebaArrayList.java
Marcelo Leonel Noguera
20/05/2017
Clase para manejar los ArrayList

- mostrar con for y for mejorado
- buscar 5 nombres (si están se eliminan y se muestran)
- agregar esos 5 nombres y mostrarlos
*/
import java.util.ArrayList;
public class PruebaArrayList
{
	static ArrayList <AlfabetoGriego> lista;


	public static String obtenerListaConFor()
	{
		String cadena = "";
		for(int x=0;x<lista.size();x++)
		{
			cadena += String.format("%s\n",lista.get(x));
		}
		return cadena;
	}
	public static String obtenerListaConForMejorado()
	{
		String cadena = "";
		for(AlfabetoGriego dato:lista)
		{
			cadena += String.format("%s\n",dato.toString());
		}
		return cadena;
	}

	public static void main(String[]args)
	{
		lista = new ArrayList <AlfabetoGriego>();
		ArrayListExtra arrayListExtra = new ArrayListExtra();

		lista.add(new AlfabetoGriego("alfa"));
		lista.add(new AlfabetoGriego("beta"));
		lista.add(new AlfabetoGriego("gamma"));
		lista.add(new AlfabetoGriego("delta"));
		lista.add(new AlfabetoGriego("épsilon"));
		lista.add(new AlfabetoGriego("dseta"));
		lista.add(new AlfabetoGriego("eta"));
		lista.add(new AlfabetoGriego("zeta"));
		lista.add(new AlfabetoGriego("iota"));
		lista.add(new AlfabetoGriego("kappa"));
		lista.add(new AlfabetoGriego("lambda"));
		lista.add(new AlfabetoGriego("mi"));
		lista.add(new AlfabetoGriego("ni"));
		lista.add(new AlfabetoGriego("xi"));
		lista.add(new AlfabetoGriego("ómicron"));
		lista.add(new AlfabetoGriego("pi"));
		lista.add(new AlfabetoGriego("rho"));
		lista.add(new AlfabetoGriego("sigma"));
		lista.add(new AlfabetoGriego("tau"));
		lista.add(new AlfabetoGriego("ípsilon"));
		lista.add(new AlfabetoGriego("fi"));
		lista.add(new AlfabetoGriego("ji"));
		lista.add(new AlfabetoGriego("psi"));
		lista.add(new AlfabetoGriego("omega"));
		//System.out.println(lista.get(0).getLetra());
		//(System.out.println(lista.size());
		//System.out.println(arrayListExtra.indiceDe("psi", lista));
		//System.out.println(arrayListExtra.contiene("omega", lista));

		//.size();  -- tamaño
		//.contains("pepe"); -- true o false según esté o no
		//.get() -- devulve el elemento especificado con el índice
		//.clear() -- elimina todo
		//.indexOf() -- devuelve el index de la primera ocurrencia
		//.set(i, X) -- modifica el elemento que esta en la posición i, por el elemento X.
		
	}
}