/* AlfabetoGriego.java
Marcelo Leonel Noguera
20/05/2017
Clase para manejar el alfabeto griego

Los nombres de las letras del alfabeto griego se escriben de la siguiente forma:
alfa,beta, gamma, delta, épsilon, dseta, eta, zeta, iota, kappa, lambda, mi, ni, xi, ómicron, pi, rho, sigma, tau, ípsilon, fi, ji, psi, omega.
*/
public class AlfabetoGriego {
	private String letra;

	public AlfabetoGriego()
	{
		letra = "";
	}
	public AlfabetoGriego(String letra)
	{
		this.letra = letra;
	}

	public void setLetra(String letra)
	{
		this.letra = letra;
	}
	public String getLetra()
	{
		return letra;
	}

	/*public AlfabetoGriego(AlfabetoGriego a)
	{
		this.letra = a.getLetra();
	}*/

}