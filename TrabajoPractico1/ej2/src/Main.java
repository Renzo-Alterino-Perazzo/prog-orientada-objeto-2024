import java.util.Scanner;
import ar.edu.unlu.poo.ListaDoble;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();
        while (true){
            System.out.println("\nMenu de Lista enlazada simple");
            System.out.println("1-Consultar si la lista esta vacia");
            System.out.println("2-Consultar cuantos elementos tiene la lista");
            System.out.println("3-Agregar elemento al final de la lista");
            System.out.println("4-Insertar elemento en la posicion deseada");
            System.out.println("5-Borrar elemento de la lista");
            System.out.println("6-Recuperar elemento de lista");
            System.out.println("0-Salir");
            System.out.println("Elija una opcion: ");

            int opcion = sc.nextInt();
            Object elemento;
            int pos;

            switch (opcion){
                case 1:
                    boolean vacia = lista.vacio();
                    System.out.println("Lista es vacia " + vacia);
                    break;
                case 2:
                    int longitud = lista.getCantidad();
                    System.out.println("Cantidad de elementos: " + longitud);
                    break;
                case 3:
                    System.out.println("Ingrese el elemento a ingresar: ");
                    elemento = sc.nextInt();
                    lista.agregar(elemento);
                    System.out.println("Elemento agregado al final de la lista\n");
                    break;
                case 4:
                    System.out.println("Ingrese el elemento a insertar: ");
                    elemento = sc.nextInt();
                    System.out.println("Ingrese la posicion a insertar: ");
                    pos = sc.nextInt();
                    if (0 < pos && pos <= lista.getCantidad()) {
                        lista.insertar(pos, elemento);
                        System.out.println("Elemento insertado en la posicion: "+ pos);
                    }
                    else {
                        System.out.println("Posicion no valida\n");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el elemento a eliminar: ");
                    elemento = sc.nextInt();
                    lista.borrar(elemento);
                    break;
                case 6:
                    System.out.println("Ingrese la posicion del elemento a recuperar: ");
                    pos = sc.nextInt();
                    if (0 < pos && pos <= lista.getCantidad()) {
                        elemento = lista.recuperar(pos);
                        System.out.println("Elemento en la posicion " + pos + ": " + elemento);
                    }
                    else {
                        System.out.println("Posicion no valida\n");
                    }
                        break;
                case 0:
                    System.out.println("Saliendo del programa\n");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, vuelva a ingresar\n");
                    break;
            }
        }
    }
}