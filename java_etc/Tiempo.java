/* Tiempo.java
Marcelo Leonel Noguera
13/05/2017
Clase para manejar el tiempo
*/
public class Tiempo {
	private int hora;
	private int minuto;
	private int segundo;

	public void setHora(int hora){
		if((hora>=0)&&(hora<25))
		{
			this.hora = hora;
		}
		else
		{
			throw new IllegalArgumentException("Error");
		}
	}
	public int getHora(){
		return hora;
	}
	public void setMinuto(int minuto){
		if((minuto>=0)&&(minuto<61))
		{
			this.minuto = minuto;
		}
		else
		{
			throw new IllegalArgumentException("Error");
		}
	}
	public int getMinuto(){
		return minuto;
	}
	public void setSegundo(int segundo){
		if((segundo>=0)&&(segundo<24))
		{
			this.segundo = segundo;
		}
		else
		{
			throw new IllegalArgumentException("Error");
		}
	}
	public int getSegundo(){
		return segundo;
	}

	public Tiempo(int h, int m, int s)
	{
		setHora(h);
		setMinuto(m);
		setSegundo(s);
	}
	public Tiempo(int h)
	{
		this(h,0,0);
	}
	public Tiempo(int h, int m)
	{
		this(h,m,0);
	}
	public Tiempo()
	{
		this(0,0,0);
	}
	public Tiempo(Tiempo t)
	{
		this(t.getHora(),t.getMinuto(),t.getSegundo());
	}

	public String toString()
	{
		String cadena = "";
		cadena += String.format("%02d:%02d:%02d",getHora(),getMinuto(),getSegundo());
		return cadena;
	}
	public String toString(Tiempo t)
	{
		String cadena = "";
		cadena += String.format("%02d:%02d:%02d",t.getHora(),t.getMinuto(),t.getSegundo());
		return cadena;
	}
	public String informe()
	{
		String cadena = "";
		//cadena += String.format("%02d:%02d:%02d %s",getHora()<12?getHora():getHora()-12,getMinuto(),getSegundo(),getHora()<12?"AM":"PM");
		cadena += String.format("%02d:%02d:%02d",getHora(),getMinuto(),getSegundo());
		return cadena;
	}
	public String informe(Tiempo t)
	{
		String cadena = "";
		//cadena += String.format("%02d:%02d:%02d %s",t.getHora()<12?t.getHora():t.getHora()-12,t.getMinuto(),t.getSegundo(),t.getHora()<12?"AM":"PM");
		cadena += String.format("%02d:%02d:%02d",t.getHora(),t.getMinuto(),t.getSegundo());
		return cadena;
	}
}