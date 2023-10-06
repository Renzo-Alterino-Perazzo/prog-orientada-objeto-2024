package ar.edu.unlu.poo.publicaciones;

public class Tesis extends Publicacion {
    private String autor;
    private String fechaPublicacion;

    public Tesis(String nombre, String editor, String telefonoProveedor, String autor, String fechaPublicacion) {
        super(nombre, editor, telefonoProveedor);
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }
}
