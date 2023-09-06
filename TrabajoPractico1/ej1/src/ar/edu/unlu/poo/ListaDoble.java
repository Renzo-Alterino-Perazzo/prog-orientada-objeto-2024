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
    public Nodo recuperar(int pos){
        Nodo actual = inicio;
        for (int i = 0; i <pos ; i++){
            actual = actual.getSiguiente();
        }
        return actual;
    }
    public void agregar(Nodo nodo){
        if (inicio==null){
            inicio = nodo;
        }
        ultimo = nodo;
        cantidad++;
    }
    public void insertar(int pos, Nodo nodo){
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
    public void eliminar(int pos){
        if (inicio==null){
            return;
        }
        else {
            Nodo actual = inicio;
            if (1 <= pos && pos <= cantidad){
                if (pos==1){
                    inicio = actual.getSiguiente();
                }
                else{
                    for (int i = 0; i < pos-2; i++){
                        actual = actual.getSiguiente();
                    }
                    Nodo temp = actual.getSiguiente();
                    actual.setSiguiente(temp.getSiguiente());
                }
            }
            cantidad--;
        }
    }
    public Nodo buscar(Object dato){
        Nodo actual = inicio;
        while (actual==null){
            if(actual.getDato()==dato){
                return actual;
            }
            else {
                actual = actual.getSiguiente();
            }
        }
        return null;
    }
    public void mostrar(){
        if (inicio==null){
            System.out.println("La lista esta vacia\n");
            return;
        }
        Nodo actual = inicio;
        System.out.println("Contenido de la lista: ");
        while (actual==null){
            System.out.println(actual + " ");
        }
        System.out.println("\n");
    }
}
