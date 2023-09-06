import ar.edu.unlu.poo.EcuacionSegundoGrado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raiz1;
        double raiz2;
        double resultado;
        int opcion;
        double a,b,c;
        EcuacionSegundoGrado ecuacion;
        double discriminante;
        while (true){
            System.out.println("\nCalculadora de ecuaciones de segundo grado");
            System.out.println("1-Realizar ecuacion");
            System.out.println("0-Salir");
            System.out.println("Elija una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresar valores de las variables");
                    System.out.println("Ingresar valor de A: ");
                    a = scanner.nextDouble();
                    if (a == 0){
                        System.out.println("No es una ecuacion de segundo grado");
                        break;
                    }
                    System.out.println("Ingresar valor de B: ");
                    b = scanner.nextDouble();
                    System.out.println("Ingresar valor de C: ");
                    c = scanner.nextDouble();
                    ecuacion = new EcuacionSegundoGrado(a,b,c);
                    discriminante = ecuacion.calcularDiscriminante();
                    if (discriminante < 0){
                        System.out.println("No tiene reaices reales");
                        break;
                    }

                    if ((ecuacion.unaRaiz())){
                        raiz1 = ecuacion.calcularRaiz1();
                        System.out.println("Tiene una sola raiz: " + raiz1);
                    }
                    else {
                    raiz1 = ecuacion.calcularRaiz1();
                        raiz2 = ecuacion.calcularRaiz2();
                        System.out.println("Tiene dos raices " + raiz1 + " y " + raiz2);
                    }
                    resultado = ecuacion.calcularValorY(raiz1);
                    System.out.println("El resultado es " + resultado);
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion invalida, vuelva a ingresar");
                    break;
            }
        }
    }
}