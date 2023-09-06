package ar.edu.unlu.poo;
import java.util.Set;
import java.util.HashSet;
public  class Diccionario {
    private Set<String> palabrasValidas;

    public Diccionario() {
        palabrasValidas = new HashSet<>();
    }

    public void agregarPalabraValida(String palabra) {
        palabrasValidas.add(palabra);
    }

    public boolean esPalabraValida(String palabra) {
        return palabrasValidas.contains(palabra);
    }
}