import ar.edu.unlu.poo.Juego;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Scanner scanner = new Scanner(System.in);
        juego.agregarPalabraValida("hola");
        juego.agregarPalabraValida("juego");
        juego.agregarPalabraValida("zorro");

        String palabra;
        System.out.println("Tienen 5 turnos cada jugador");
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese palabra jugador 1: ");
            palabra = scanner.nextLine();
            juego.agregarPalabra("Jugador 1",palabra);
            System.out.println("Ingrese palabra jugador 2: ");
            palabra = scanner.nextLine();
            juego.agregarPalabra("Jugador 2",palabra);
        }

        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
    }
}