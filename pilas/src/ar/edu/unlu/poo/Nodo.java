package ar.edu.unlu.poo;

public class Nodo {
    private Object dato = null;
    private Nodo anterior = null;
    private Nodo siguiente = null;

    public void setDato(Object dato) {
        this.dato = dato;
    }
    public Object getDato() {
        return dato;
    }
    public void setSiguiente (Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo getSiguiente () {
        return siguiente;
    }
    public void setAnterior (Nodo anterior) {
        this.anterior = anterior;
    }
    public Nodo getAnterior () {
        return anterior;
    }
}
