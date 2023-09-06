package ar.edu.unlu.poo;

public class Nodo {
    private Object dato;
    private Nodo anterior;
    private Nodo siguiente;
    public Nodo(){
        dato = null;
        anterior = null;
        siguiente = null;
    }
    public void setDato(Object dato){
        this.dato = dato;
    }
    public Object getDato(){
        return dato;
    }
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    public Nodo getAnterior(){
        return anterior;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }

}
