package ar.edu.unlu.poo;
import java.time.LocalDate;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completada;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setCompletada(boolean completada){
        this.completada = completada;
    }
    public boolean getCompletada(){
        return completada;
    }
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    public int getPrioridad(){
        return prioridad;
    }
    public void setFechaRecordatorio(LocalDate fechaRecordatorio){
        this.fechaRecordatorio = fechaRecordatorio;
    }
    public LocalDate getFechaRecordatorio(){
        return fechaRecordatorio;
    }
    public void setFechaLimite(LocalDate  fechaLimite){
        this.fechaLimite = fechaLimite;
    }
    public LocalDate getFechaLimite(){
        return fechaLimite;
    }

    public boolean vencida(){
        return !completada && LocalDate.now().isAfter(fechaLimite);
    }
    public void mostrarVencida(){
        if (vencida()){
            System.out.println("(Vencida) " + descripcion);
        }
        else if (fechaRecordatorio != null && LocalDate.now().isBefore(fechaRecordatorio)){
            System.out.println("(por vencer)" + descripcion);
            prioridad = 1;
        }
        else {
            System.out.println(descripcion);
        }
    }
}

