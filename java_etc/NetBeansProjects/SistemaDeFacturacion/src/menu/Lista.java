/* Lista.java
Marcelo Leonel Noguera
02/09/2017
*/
package menu;

public class Lista
{
    private Nodo inicio = null;
    private Nodo fin = null;
    private String nombre = null;


    public int getNodo(int indice)
    {
        Nodo p = null;
        p = inicio;
        int dato = -1;

        while(p != fin)
        {
            if(p.getId() == indice)
            {
                dato = p.getDato();
            }
            p = p.getProximoNodo();
        }
        if(p != null)
        {
            if(p.getId() == indice)
            {
                return p.getDato();
            }
        }
        return dato;
    }
    public boolean buscarNodo(int datoBuscar)
    {
        Nodo p = null;
        p = inicio;
        boolean bandera = false;

        while(p != fin)
        {
            if(p.getDato() == datoBuscar)
            {
                bandera = true;
            }
            p = p.getProximoNodo();
        }
        if(p != null)
        {
            if(p.getDato() == datoBuscar)
            {
                bandera = true;
            }
        }
        return bandera;
    }
    public void borrarNodo()
    {   
        // esta función borra el último nodo de la lista
        Nodo p = null;
        p = inicio;

        while(p.getProximoNodo() != fin)
        {
            p = p.getProximoNodo();
            // anteultimo nodo
        }
        if(p != null)
        {
            // ultimo nodo
            fin = p;
            p.setProximoNodo(null);
        }
    }
    public void borrarNodo(int indice)
    {
        Nodo p = null;
        p = inicio;

        if(p.getId() == indice)
        {
            // esto sirve para borrar el primero en caso de indicarse el índice 0
            inicio = p.getProximoNodo();
        }

        while(p != fin)
        {
            if((p.getProximoNodo().getId() == indice) && (p.getProximoNodo() != fin))
            {
                p.setProximoNodo(p.getProximoNodo().getProximoNodo());
            }

            p = p.getProximoNodo();
            
            // anteultimo nodo

            //System.out.printf("\n  ID del nodo: %d\n  Dato del nodo: %d\n  Siguiente nodo: id: %d dato: %d\n", p.getId(), p.getDato(), p.getProximoNodo().getId(), p.getProximoNodo().getDato());
        }
        if(p != null)
        {
            // ultimo nodo
            /*if(p.getProximoNodo().getId() == indice)
            {
                fin = p;
                p.setProximoNodo(null);
            }*/
            System.out.printf("Este es: %d - %d", p.getId(), p.getDato());
        }
    }
    public void unir(Lista l)
    {
        
    }

    public Nodo getInicio()
    {
        return inicio;
    }

    public void setInicio(Nodo inicio)
    {
        this.inicio = inicio;
    }

    public Nodo getFin()
    {
        return fin;
    }

    public void setFin(Nodo fin)
    {
        this.fin = fin;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addNuevoNodo(Nodo nuevo)
    {
        if(inicio == null)
        {
            fin = nuevo;
            inicio = nuevo;
        }
        else
        {
            fin.setProximoNodo(nuevo);
            fin = nuevo;
        }
    }

    public void recorrerLista()
    {
        Nodo p = null;
        p = inicio;
        while(p != fin)
        {
            System.out.printf("%s", p);
            p = p.getProximoNodo();
        }
        if(p != null)
        {
            System.out.printf("%s", p);
        }
    }

    public Lista (String nombre)
    {
        this.setNombre(nombre);
    }
}