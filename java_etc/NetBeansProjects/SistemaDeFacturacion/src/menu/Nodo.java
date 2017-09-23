/* Nodo.java
Marcelo Leonel Noguera
02/09/2017
*/
package menu;

public class Nodo
{
    private int dato;
    private Nodo proximoNodo;
    private int id;
    private static int numeroNodos = 0;

    public int getDato()
    {
        return dato;
    }

    public void setDato(int dato)
    {
        this.dato = dato;
    }

    public Nodo getProximoNodo()
    {
        return proximoNodo;
    }

    public void setProximoNodo(Nodo proximoNodo)
    {
        this.proximoNodo = proximoNodo;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    
    @Override
    public String toString()
    {
        return String.format(" ID: %d\n Dato: %d\n", getId(), getDato());
    }

    public Nodo (int d)
    {
        id = numeroNodos++;
        dato = d;
        proximoNodo = null;
    }
}