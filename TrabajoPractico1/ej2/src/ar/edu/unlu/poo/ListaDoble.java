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
            nodo.setAnterior(ultimo);
            ultimo = nodo;
        }
        cantidad++;
    }
    public void insertar(int pos, Object elemento){
        if (pos < 1 || pos > cantidad+1){
            return;
        }
        Nodo nodo = new Nodo();
        nodo.setDato(elemento);
        if (pos == 1){
            nodo.setSiguiente(inicio);
            inicio.setAnterior(nodo);
            inicio = nodo;
        }
        else if (pos == cantidad+1) {
            nodo.setAnterior(ultimo);
            ultimo.setSiguiente(nodo);
            ultimo = nodo;
        }
        else {
            Nodo temp = inicio;
            for (int i = 1; i < pos-1; i++){
                temp = temp.getSiguiente();
            }
            nodo.setSiguiente(temp.getSiguiente());
            nodo.setAnterior(temp);
            temp.getSiguiente().setAnterior(nodo);
            temp.setSiguiente(nodo);
        }
        cantidad++;
    }
    public void borrar(Object dato) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                if (actual == inicio) {
                    inicio = actual.getSiguiente();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    }
                } else if (actual == ultimo) {
                    ultimo = actual.getAnterior();
                    if (ultimo != null) {
                        ultimo.setSiguiente(null);
                    }
                } else {
                    actual.getAnterior().setSiguiente(actual.getSiguiente());
                    actual.getSiguiente().setAnterior(actual.getAnterior());
                }
                cantidad--;
                return;
            }
            actual = actual.getSiguiente();
        }
    }
}

