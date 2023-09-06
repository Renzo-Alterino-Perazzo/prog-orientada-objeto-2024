package ar.edu.unlu.poo;
import java.util.List;
import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private List<String> palabras;
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.palabras = new ArrayList<>();
        this.puntaje = 0;
    }

    public void agregarPalabra(String palabra) {
        palabras.add(palabra);
    }

    public List<String> getPalabras() {
        return palabras;
    }

    public int calcularPuntaje() {
        for (String palabra : palabras) {
            puntaje += palabra.length();
            for (char letra : palabra.toCharArray()) {
                if ("kzxwqy".contains(String.valueOf(letra))) {
                    puntaje++;
                }
            }
        }
        return puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }
}