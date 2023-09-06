package ar.edu.unlu.poo;

public class Libro {
    private String[] autor;
    private String[] titulo;
    private int paginas;
    private int ejemplares;
    private int disponibles;
    private int prestados;
    public Libro(){
        autor = new String[]{""};
        titulo = new  String[]{""};
        paginas = 0;
        ejemplares = 0;
        disponibles = 0;
        prestados = 0;
    }
}
