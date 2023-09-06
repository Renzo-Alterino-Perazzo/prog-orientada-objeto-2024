package ar.edu.unlu.poo;
import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private boolean completada;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;
    private LocalDate fechaFinalizacion;
    private String colaborador;
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    public void setCompletada(boolean completada){
        this.completada = completada;
    }
    public void setFechaLimite(LocalDate fechaLimite){
        this.fechaLimite = fechaLimite;
    }
    public void setFechaRecordatorio(LocalDate fechaRecordatorio){
        this.fechaRecordatorio = fechaRecordatorio;
    }
    public void setFechaFinalizacion(LocalDate fechaFinalizacion){
        this.fechaFinalizacion = fechaFinalizacion;
    }
    public boolean vencida(){
        return !completada && LocalDate.now().isAfter(fechaLimite);
    }
    public boolean completada(){
        return completada;
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
    public void mostrarRealizada(){
        String estado = completada ? "Realizada" : "Pendiente";
        String infoColaborador = completada ? " por " + colaborador: "";
        String fechaInfo = completada ? " el " + fechaFinalizacion : "";
        setDescripcion("Tarea: " + descripcion + " (" + estado + infoColaborador + fechaInfo + ")");
    }
}

