/* EmpleadosHerenciaPolimorfismoPrueba.java
Marcelo Leonel Noguera
24/03/2017
- herencia y polimorfismo*/
public class EmpleadosHerenciaPolimorfismoPrueba
{
	public static void main(String[]args)
	{
		PorPagar []cuentasPorPagar = new PorPagar[6];
		cuentasPorPagar[0] = new Asalariado("Pepe0","pepe",123456789,10000);
		cuentasPorPagar[1] = new Servicios("Internet",45880,"Interface",700,new Fecha(2,4,2017));
		//String descripcion, String nombre, int item, int cantidad, double precio
		cuentasPorPagar[2] = new Factura("vaso de porcelana","vaso",452240,4,15);
		cuentasPorPagar[3] = new Asalariado("Pepe3","pepe",123456789,10000);
		cuentasPorPagar[4] = new Asalariado("Pepe3","pepe",123456789,10000);
		cuentasPorPagar[5] = new Asalariado("Pepe3","pepe",123456789,10000);

		for(PorPagar cuentaActual:cuentasPorPagar)
		{
			System.out.printf("%s\n",cuentaActual);
			if(cuentaActual instanceof AsalariadoMasComision)
			{
				AsalariadoMasComision empleado = (AsalariadoMasComision) cuentaActual;
				empleado.setSalario(empleado.getSalario()*1.2);
			}
		}
	}
}