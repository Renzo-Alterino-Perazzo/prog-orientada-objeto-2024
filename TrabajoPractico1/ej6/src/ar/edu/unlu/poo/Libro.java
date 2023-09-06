package ar.edu.unlu.poo;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private int ejemplares;
    private int prestados;
    public Libro(String titulo, String autor, int numPaginas, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = numPaginas;
        this.ejemplares = numEjemplares;
        this.prestados = 0;
    }
    public boolean prestar() {
        if (ejemplares - prestados > 0) {
            prestados++;
            return true;
        } else {
            return false; // No quedan ejemplares disponibles para préstamo.
        }
    }
    public String getDescripcion() {
        return "El libro " + titulo + " creado por el autor " + autor + " tiene " + paginas + " páginas, quedan " +  (ejemplares - prestados) + " disponibles y se prestaron " + prestados;
    }
    public int getPaginas() {
        return paginas;
    }
}
