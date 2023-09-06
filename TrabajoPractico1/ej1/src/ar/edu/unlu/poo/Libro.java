package ar.edu.unlu.poo;
import java.lang.String;
public class Libro {
    private String nombre = "";
    private String[] autores = new String[5];
    private String isbn = "";
    private int paginas = 0;
    private int ejemplares = 0;
    private int prestados = 0;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAutores(String[] autores){
        this.autores = autores;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }
    public void setCantPrestados(int cantEjemplares){
        this.ejemplares = cantEjemplares;
    }
}
