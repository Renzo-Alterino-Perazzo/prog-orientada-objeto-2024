package ar.edu.unlu.poo;
import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completada;
    private LocalDate fechaLimite;

    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;
        this.fechaLimite = fechaLimite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void cambiarCompletado(boolean completada) {
        this.completada = completada;
    }

    public boolean estaVencida() {
        return !completada && LocalDate.now().isAfter(fechaLimite);
    }

}