package ar.edu.unlu.poo;

public class Pila {
    Nodo tope = null;
    public boolean vacia(){
        return tope == null;
    }
    public void apilar(Nodo nuevoNodo){
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
    }
    public Nodo desapilar() {
        if (vacia()){
            return null;
        }
        else {
            Nodo actual = tope;
            tope = tope.getSiguiente();
            return actual;
        }
    }
    public Nodo getTope(){
        return tope;
    }
    public void mostar(){
        if (vacia()){
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
