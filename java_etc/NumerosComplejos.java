/* NumerosComplejos.java
Marcelo Leonel Noguera
18/03/2017
ejercicio de números complejos*/
public class NumerosComplejos{
	private double parteReal;
	private double parteImaginaria;
	public NumerosComplejos(double real, double imaginaria){
		setParteReal(real);
		setParteImaginaria(imaginaria);
	}
	public NumerosComplejos(double real){
		setParteReal(real);
		setParteImaginaria(0);
	}
	public NumerosComplejos(){
		setParteReal(0);
		setParteImaginaria(0);
	}

	public void setParteReal(double real){
		parteReal = real;
	}
	public double getParteReal(){
		return parteReal;
	}
	public void setParteImaginaria(double imaginaria){
		parteImaginaria = imaginaria;
	}
	public double getParteImaginaria(){
		return parteImaginaria;
	}

	public String informar(){
		String informe = String.format("%f + %fi\n",getParteReal(),getParteImaginaria());
		return informe;
	}

	public String sumar(NumerosComplejos z1, NumerosComplejos z2){
		String resultadoSuma = String.format("Resultado: %f + %fi\n",(z1.getParteReal()+z2.getParteReal()),(z1.getParteImaginaria()+z2.getParteImaginaria()));
		return resultadoSuma;
	}
}