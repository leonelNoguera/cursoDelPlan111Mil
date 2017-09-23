/*
EmpleadoPorComision.java

Alejandro Belo

3/6/2017
*/

public class EmpleadoPorComision2
{
	protected String primerNombre;
	protected String apellidoPaterno;
	protected String numeroSeguro;
	protected Double tarifaComision;
	protected Double ventasBrutas;

	//Constructor
	public EmpleadoPorComision2(String pNombre, String apellidoP, String numSeguro, Double tarifaCom, Double ventasB){

	setPrimerNombre(pNombre);
	setApellidoPaterno(apellidoP);
	setNumeroSeguro(numSeguro);
	setTarifaComision(tarifaCom);
	setVentasBrutas(ventasB);
}


public void setPrimerNombre(String nom){    

	if ((nom.length()>0)&&(nom.length()<20)){

		primerNombre=nom;

	}

    else{

		throw new IllegalArgumentException("Tamaño incorrecto");

	}

}  

public String getPrimerNombre(){

return primerNombre;

}

public void setApellidoPaterno(String ape){    

	if ((ape.length()>0)&&(ape.length()<20)){

		apellidoPaterno=ape;

	}

    else{

		throw new IllegalArgumentException("Tamaño incorrecto");

	}

} 

public String getApellidoPaterno(){

return apellidoPaterno;

}

public void setNumeroSeguro(String num){    

	if ((num.length()>0)&&(num.length()<10)){

		numeroSeguro=num;

	}

    else{

		throw new IllegalArgumentException("Tamaño incorrecto");

	}

} 

public String getNumeroSeguro(){

return numeroSeguro;

}


public void setTarifaComision(Double tar){    

	if ((tar>0.0)&&(tar<1.0)){

		tarifaComision=tar;

	}

    else{

		throw new IllegalArgumentException("Comision incorrecta");

	}

} 

public double getTarifaComision(){

return tarifaComision;

}

public void setVentasBrutas(Double ven){    

	if (ven>=0.0){

		ventasBrutas=ven;

	}

    else{

		throw new IllegalArgumentException("Ventas incorrecta");

	}

} 

public double getVentasBrutas(){

return ventasBrutas;

}

public double calcularIngresos(){

double ingresos= (ventasBrutas*tarifaComision);

return ingresos;

}

public String toString(){

String informe="";

informe+=String.format("Empleado por comision: %s %s\n", primerNombre, apellidoPaterno);
informe+=String.format("Seguro: %s \n", numeroSeguro);
informe+=String.format("Ventas Brutas: %.2f \n", ventasBrutas);
informe+=String.format("Tarifa comision: %.2f \n", tarifaComision);

return informe;
}

}//fin de la clase