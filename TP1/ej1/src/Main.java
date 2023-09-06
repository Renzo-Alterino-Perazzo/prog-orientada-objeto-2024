import ar.edu.unlu.poo.Lista;
import ar.edu.unlu.poo.Nodo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Lista lista = new Lista();
        System.out.println("Elija la opcion que desea\n");
        System.out.println("1-Crear una nueva Lista\n");
        System.out.println("2-Consultar si la lista es vacia\n");
        System.out.println("3-Consultar la longitud de la lista\n");
        System.out.println("4-Agregar elemento al final de la lista\n");
        System.out.println("5-Borrar todas las instancias del elemento en la lista\n");
        System.out.println("6-Recuperar elemento de la posicion deseada\n");
        System.out.println("7-Eliminar elemento en la posicion dada\n");
        System.out.println("8-Mostar elementos de la lista\n");
        System.out.println("Para terminar elija cualquier otro numero\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la opcion: ");
        String opcion = sc.nextLine();
        switch (opcion){
            case "1":
                System.out.println("Lista creada\n");
                lista = new Lista();
                break;
            case "2":
                if (lista.vacio()){
                    System.out.println("La lista esta vacia\n");
                }
                else {
                    System.out.println("Lista no esta vacia");
                }
                break;
            case "3":
                int longitud = lista.longitud();
                System.out.println("La longitud tiene " + longitud + " elementos");
                break;
            case "4":
                System.out.println("Ingrese el elemento: ");
                Object dato = (Object) sc.nextLine();
                Nodo nodo = new Nodo();
                nodo.setDato(dato);
            case "5":
        }
    }
}