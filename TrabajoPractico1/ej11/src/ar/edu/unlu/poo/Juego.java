package ar.edu.unlu.poo;

public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;
    private Diccionario diccionario;

    public Juego() {
        jugador1 = new Jugador("Jugador 1");
        jugador2 = new Jugador("Jugador 2");
        diccionario = new Diccionario();
    }

    public void agregarPalabra(String jugador, String palabra) {
        if (diccionario.esPalabraValida(palabra)) {
            if (jugador.equals("Jugador 1")) {
                jugador1.agregarPalabra(palabra);
            } else if (jugador.equals("Jugador 2")) {
                jugador2.agregarPalabra(palabra);
            }
        }
    }

    public void agregarPalabraValida(String palabra) {
        diccionario.agregarPalabraValida(palabra);
    }

    public String determinarGanador() {
        int puntajeJugador1 = jugador1.calcularPuntaje();
        int puntajeJugador2 = jugador2.calcularPuntaje();

        if (puntajeJugador1 > puntajeJugador2) {
            return jugador1.getNombre();
        } else if (puntajeJugador2 > puntajeJugador1) {
            return jugador2.getNombre();
        } else {
            return "Empate";
        }
    }
}

