package ar.edu.unlu.poo;

public class Cola {
    private Nodo frente = null;
    private Nodo ultimo = null;

    public boolean vacia(){
        return frente == null;
    }
    public void encolar(Object elemento){
        Nodo nodo = new Nodo();
        nodo.setDato(elemento);
        if (vacia()){
            frente = nodo;
        }
        else {
            ultimo.setSiguiente(nodo);
        }
        ultimo = nodo;
    }
    public Object desencolar(){
        Nodo actual = frente;
        frente = actual.getSiguiente();
        return actual.getDato();
    }
    public Object recuperar(){
        return frente.getDato();
    }
}
