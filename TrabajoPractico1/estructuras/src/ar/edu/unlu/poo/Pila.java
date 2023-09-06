package ar.edu.unlu.poo;

public class Pila {
    Nodo tope = null;
    public boolean vacia(){
        return tope == null;
    }
    public void apilar(Object elemento){
        Nodo nodo = new Nodo();
        nodo.setDato(elemento);
        if (tope==null){
            tope = nodo;
        }
        else {
            tope.setSiguiente(nodo);
            tope = nodo;
        }
    }
    public Object desapilar() {
        Nodo actual = tope;
        tope = tope.getSiguiente();
        return actual.getDato();
    }
    public Object getTope(){
        return tope.getDato();
    }
}
