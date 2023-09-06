package ar.edu.unlu.poo;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private int totalPrestamos = 0;

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.getDescripcion());
        }
    }

    public boolean prestarLibro(Libro libro) {
        boolean prestar = libro.prestar();
        if (prestar) {
            totalPrestamos++;
        }
        return prestar;
    }

    public int getTotalPrestamos() {
        return totalPrestamos;
    }

    public Libro obtenerLibroConMasPaginas() {
        if (libros.isEmpty()) {
            return null;
        }
        Libro libroConMasPaginas = libros.get(0);
        for (Libro libro : libros) {
            if (libro.getPaginas() > libroConMasPaginas.getPaginas()) {
                libroConMasPaginas = libro;
            }
        }
        return libroConMasPaginas;
    }
}
