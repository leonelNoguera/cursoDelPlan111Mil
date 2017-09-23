/* NumerosPrimos.java
Marcelo Leonel Noguera
06/09/2017*/
package numerosprimos;

public class NumerosPrimos
{
	public static void main(String[] args)
	{
		int longitud = 100;
		int []numeros = new int[longitud];

        for(int i=0; i<longitud; i++)
        {
        	numeros[i] = i + 1;
        }

        int numeroPrimo = 2;
        int contadorNumero = 0;
        int contadorDePrimos = 0;

        for(int j = 1; j<longitud; j++)
	    {
	        for(int i=0; i<longitud; i++)
	        {
	        	if((numeros[i] % numeroPrimo == 0) && (numeros[i] != numeroPrimo))
	        	{
	        		numeros[i] = 1;
	        	}
	        }
	        if(numeros[j] != 1)
	        {
	        	numeroPrimo = numeros[j];
	        }
    	}

        for(int i=0; i<longitud; i++)
        {
        	if(numeros[i] != 1)
        	{
        		if(contadorDePrimos % 10 == 0)
        		{
        			System.out.println();
        		}
        		System.out.printf("- %d ", numeros[i]);
        		contadorDePrimos++;
        	}
        }
    }
}
