package ar.edu.unlu.poo;

public class Pila {
    Nodo tope;
    public Pila(){
        tope = null;
    }
    public boolean vacia(){
        return tope == null;
    }
    public void apilar(Nodo nuevoNodo){
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
    }
    public Nodo desapilar() {
        if (tope == null){
            return null;
        }
        else {
            Nodo actual = tope;
            tope = tope.getSiguiente();
            return actual;
        }
    }
    public Nodo elTope(){
        return tope;
    }
    public void mostar(){
        if (tope==null){
            System.out.println("La pila esta vacia\n");
            return;
        }
        Nodo actual = tope;
        System.out.println("Contenido de la pila: ");
        while (actual != null){
            System.out.println(actual + " ");
            actual = actual.getSiguiente();
        }
        System.out.println("\n");
    }

}
