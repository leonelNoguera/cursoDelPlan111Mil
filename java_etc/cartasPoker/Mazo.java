/*Mazo.java
Marcelo Leonel Noguera
29/04/2017
- Simular poker
*/
import java.util.Random;
public class Mazo
{
	private Carta [] mazo;
	private int cartaActual = 0;
	private static final Random numeroAleatorio = new Random();
	private static final int NUMERO_DE_CARTAS = 52;

	public Mazo ()
	{
		String []palos = {"PICA","CORAZONES","DIAMANTES","TREBOL"};
		String []caras = {"AS","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ","JACK","QUEEN","KING"};

		mazo = new Carta[NUMERO_DE_CARTAS];

		for (int x=0;x<NUMERO_DE_CARTAS;x++)
		{
			mazo[x] = new Carta(palos[x/13], caras[x%13]);
		}
	}

	public void barajar()
	{
		cartaActual = 0;
		int segunda = 0;
		Carta aux;
		for (int primera=0;primera<NUMERO_DE_CARTAS;primera++)
		{
			segunda = numeroAleatorio.nextInt(NUMERO_DE_CARTAS);
			aux = mazo[primera];
			mazo[primera] = mazo[segunda];
			mazo[segunda] = aux;
		}
	}
	public Carta repartir()
	{
		if(cartaActual<NUMERO_DE_CARTAS)
		{
			return mazo[cartaActual++];
		}
		else
		{
			return null;
		}
	}
}