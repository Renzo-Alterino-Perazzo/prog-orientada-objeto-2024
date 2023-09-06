import ar.edu.unlu.poo.Biblioteca;
import ar.edu.unlu.poo.Libro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Bakemonogatari", "NisioIsiN", 100, 5);
        Libro libro2 = new Libro("The JoJolands", "Hirohiko Araki", 300, 1);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();

        Libro libroConMasPaginas = biblioteca.obtenerLibroConMasPaginas();
        System.out.println("El libro con más páginas es: " + libroConMasPaginas.getDescripcion());

        // Intentar prestar un libro con 10 ejemplares y uno con 1 solo ejemplar.
        if (biblioteca.prestarLibro(libro1)) {
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("No quedan ejemplares disponibles para préstamo.");
        }

        if (biblioteca.prestarLibro(libro2)) {
            System.out.println("Libro prestado con éxito.");
        } else {
            System.out.println("No quedan ejemplares disponibles para préstamo.");
        }

        System.out.println("Cantidad total de préstamos realizados: " + biblioteca.getTotalPrestamos());
    }
}