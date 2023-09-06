package ar.edu.unlu.poo;

public class Lista{
    private Nodo inicio = null;
    private int cantidad = 0;
    public boolean vacio(){
        return cantidad == 0;
    }
    public int longitud(){
        return cantidad;
    }
    public Object recuperar(int pos){
        Nodo actual = inicio;
        for (int i = 1; i < pos ; i++){
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }
    public void agregar(Object elemento){
        Nodo nodo = new Nodo();
        nodo.setDato(elemento);
        if (inicio == null){
            nodo.setSiguiente(inicio);
            inicio = nodo;
        }
        else {
            Nodo auxiliar = inicio;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nodo);
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
        else{
            Nodo temp = inicio;
            for (int i = 0; i < pos-2; i++){
                temp = temp.getSiguiente();
            }
            nodo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nodo);
        }
        cantidad++;
    }
    public void borrar(Object dato){
        Nodo actual = inicio;
        Nodo anterior = null;
        while (actual!=null){
             if (actual.getDato().equals(dato)){
                 if (anterior==null){
                     inicio = actual.getSiguiente();
                 }
                 else {
                     anterior.setSiguiente(actual.getSiguiente());
                 }
                 cantidad--;
             }
             anterior = actual;
             actual = actual.getSiguiente();
        }
    }
    public Nodo buscar(Object dato){
        Nodo actual = inicio;
        while (actual!=null){
            if(actual.getDato()==dato){
                return actual;
            }
            else {
                actual = actual.getSiguiente();
            }
        }
        return null;
    }
}

