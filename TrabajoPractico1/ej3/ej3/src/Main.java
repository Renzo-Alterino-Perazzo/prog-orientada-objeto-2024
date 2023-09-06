import java.util.Scanner;
import ar.edu.unlu.poo.Pila;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        while (true){
            System.out.println("\nMenu de Pila");
            System.out.println("1-Consultar si la pila es vacia");
            System.out.println("2-Apilar elemento en el tope");
            System.out.println("3-Desapilar elemento en el tope de la pila");
            System.out.println("4-Mostrar tope sin desapilar");
            System.out.println("0-Salir");
            System.out.println("Elija una opcion: ");

            int opcion = sc.nextInt();
            Object elemento;
            int pos;

            switch (opcion){
                case 1:
                    boolean vacia = pila.vacia();
                    System.out.println("Pila es vacia "+ vacia);
                    break;
                case 2:
                    System.out.println("Ingrese elemento a apilar");
                    elemento = sc.nextInt();
                    pila.apilar(elemento);
                    System.out.println("Elemento apilado");
                    break;
                case 3:
                    if (pila.vacia()){
                        System.out.println("Pila no tiene elementos");
                    }
                    else {
                        elemento = pila.desapilar();
                        System.out.println("Elemento desapilado: " + elemento);
                    }
                    break;
                case 4:
                    elemento = pila.getTope();
                    System.out.println("Elemento en el tope: " + elemento);
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, vuelva a ingresar");
                    break;
            }
        }
    }
}