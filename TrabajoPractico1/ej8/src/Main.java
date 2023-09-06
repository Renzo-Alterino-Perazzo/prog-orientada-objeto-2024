import ar.edu.unlu.poo.ContraseniaGuardar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longitud;
        System.out.print("Ingrese la cantidad de contraseñas que desea generar: ");
        int cantidad = scanner.nextInt();
        do {
            System.out.print("Ingrese la longitud de las contraseñas (8 o mas caracteres): ");
            longitud = scanner.nextInt();
        } while (longitud<8);

        ContraseniaGuardar colleccionContrasenia = new ContraseniaGuardar(cantidad,longitud);

        System.out.println("\nContraseñas generadas:");
        colleccionContrasenia.showPasswordsStrength();
    }
}
