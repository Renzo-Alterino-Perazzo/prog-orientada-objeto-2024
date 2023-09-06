package ar.edu.unlu.poo;
import java.time.LocalDate;

public class Tarea {
    private String[] descripcion;
    private int prioridad;
    private boolean completada = false;
    private LocalDate fechaLimite;
    public void setDescripcion(String[] descripcion){
        this.descripcion = descripcion;
    }
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    public void setFechaLimite(LocalDate fechaLimite){
        this.fechaLimite = fechaLimite;
    }
    public boolean vencida(){
        return !completada && LocalDate.now().isAfter(fechaLimite);
    }
    public boolean completada(){
        return completada;
    }
    public void mostrar(){
        if (vencida()){
            System.out.println("(Vencida) " + descripcion);
        }
        else {
            System.out.println(descripcion);
        }
    }
}