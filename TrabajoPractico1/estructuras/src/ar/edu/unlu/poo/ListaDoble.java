package ar.edu.unlu.poo;

public class ListaDoble {
    private Nodo inicio = null;
    private Nodo ultimo = null;
    private int cantidad = 0;
    public boolean vacio(){
        return cantidad == 0;
    }
    public int getCantidad(){
        return cantidad;
    }
    public Object recuperar(int pos){
        if (pos==1){
            return inicio.getDato();
        }
        else if (pos==cantidad) {
            return ultimo.getDato();
        }
        else {
            Nodo actual = inicio;
            for (int i = 2; i < pos; i++) {
                actual = actual.getSiguiente();
            }
            return actual.getDato();
        }
    }
    public void agregar(Object elemento){
        Nodo nodo = new Nodo();
        nodo.setDato(elemento);
        if (inicio==null){
            inicio = nodo;
            ultimo = nodo;
        }
        else {
            ultimo.setSiguiente(nodo);
            ultimo = nodo;
        }
        cantidad++;
    }
    public void insertar(int pos, Object elemento){
        Nodo nodo = new Nodo();
        nodo.setDato(elemento);
        if (pos == 1){
            nodo.setSiguiente(inicio);
            inicio = nodo;
        }
        else {
            if (pos <= cantidad) {
                Nodo temp = inicio;
                for (int i = 0; i < pos - 2; i++) {
                    temp = temp.getSiguiente();
                }
                nodo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nodo);
            }
            else {
                ultimo.setSiguiente(nodo);
                ultimo = nodo;
            }
        }
        cantidad++;
    }
    public void borrar(Object dato){
        if (inicio==null){
            return;
        }
        else {
            Nodo actual = inicio;
            while (actual != null && actual.getDato() == dato){
                inicio = inicio.getSiguiente();
                cantidad--;
                actual = inicio;
            }
            Nodo temp;
            while (actual != null && actual.getSiguiente() != null){
                if (actual.getSiguiente().getDato() == dato){
                    temp = actual.getSiguiente();
                    actual.setSiguiente(temp.getSiguiente());
                    cantidad--;
                }
                else {
                    actual = actual.getSiguiente();
                }
            }
        }
    }
}
