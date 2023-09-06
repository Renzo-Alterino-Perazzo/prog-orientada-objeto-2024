package ar.edu.unlu.poo;

public class Cola {
    private Nodo frente = null;
    private Nodo ultimo = null;

    public boolean vacia(){
        return frente == null;
    }
    public void encolar(Nodo nodo){
        if (vacia()){
            frente = nodo;
        }
        else {
            ultimo.setSiguiente(nodo);
        }
        ultimo = nodo;
    }
    public Nodo desencolar(){
        if (frente==null){
            System.out.println("La cola esta vacia\n");
            return null;
        }
        Nodo actual = frente;
        frente = actual.getSiguiente();
        return actual;
    }
    public Nodo recuperar(){
        if (frente==null){
            System.out.println("La cola esta vacia\n");
            return null;
        }
        return frente;
    }
    public void mostrar(){
        if (frente==null){
            System.out.println("La cola esta vacia\n");
        }
        System.out.println("Contenido de la cola: ");
        Nodo actual = frente;
        while (actual!=null){
            System.out.println(actual + " ");
            actual = actual.getSiguiente();
        }
        System.out.println("\n");
    }
}
