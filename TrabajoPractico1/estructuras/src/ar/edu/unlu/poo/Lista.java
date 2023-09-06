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
        if (vacio()){
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
        if (vacio()){
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
                cantidad--;
            }

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
    /*public void mostrar(){
        if (inicio==null){
            System.out.println("La lista esta vacia\n");
            return;
        }
        Nodo actual = inicio;
        System.out.println("Contenido de la lista: ");
        while (actual==null){
            System.out.println(actual.getDato() + " ");
        }
        System.out.println("\n");
    }*/

}
