import ar.edu.unlu.poo.Cola;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();

        while (true){
            System.out.println("\nMenu de Cola");
            System.out.println("1-Consultar si la cola es vacia");
            System.out.println("2-Encolar elemento al final de la cola");
            System.out.println("3-Deseconla elemento elemento al frente de la cola");
            System.out.println("4-Mostrar elemento al frente de la cola");
            System.out.println("0-Salir");
            System.out.println("Elija una opcion: ");

            int opcion = sc.nextInt();
            Object elemento;
            int pos;

            switch (opcion){
                case 1:
                    boolean vacia = cola.vacia();
                    System.out.println("Cola es vacia: " + vacia);
                    break;
                case 2:
                    System.out.println("Ingrese elemento a encolar");
                    elemento = sc.nextInt();
                    cola.encolar(elemento);
                    System.out.println("Elemento encolado");
                    break;
                case 3:
                    if (cola.vacia()){
                        System.out.println("Cola esta vacia");
                    }
                    else {
                        elemento = cola.desencolar();
                        System.out.println("Elemento desencolado: " + elemento);
                    }
                    break;
                case 4:
                    if (cola.vacia()){
                        System.out.println("Cola esta vacia");
                    }
                    else {
                        elemento = cola.recuperar();
                        System.out.println("Elemento en el frente: " + elemento);
                    }
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