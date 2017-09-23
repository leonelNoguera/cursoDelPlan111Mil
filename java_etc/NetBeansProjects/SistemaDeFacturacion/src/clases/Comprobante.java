/* Comprobante.java
Marcelo Leonel Noguera
19/08/2017*/
package clases;
import java.util.Date;

public class Comprobante
{

    private Date fecha;

    private String tipo;

    private int numeroIdentificador;

    private double importeTotal;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Comprobante(Date fecha, String tipo, int numeroIdentificador, double importeTotal) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.numeroIdentificador = numeroIdentificador;
        this.importeTotal = importeTotal;
    }

}
