/*Carta.java
Marcelo Leonel Noguera
29/04/2017
- Simular poker
*/
public class Carta
{
	private String palo;
	private String cara;
	public Carta (String palo, String cara)
	{
		this.palo = palo;
		this.cara = cara;
	}
	public String toString()
	{
		return cara+" de "+palo;
	}

	/*public void setPalo(String palo){
		this.palo = palo;
	}
	public String getPalo(){
		return palo;
	}
	public void setCara(String cara){
		this.cara = cara;
	}
	public String getCara(){
		return cara;
	}*/
}