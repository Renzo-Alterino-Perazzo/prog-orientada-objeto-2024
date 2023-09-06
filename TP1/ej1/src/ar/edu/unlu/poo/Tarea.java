package ar.edu.unlu.poo;
import java.time.LocalDate;
import java.util.Date;
import java.lang.String;
//mas bajo numero de prioridad mayor prioridad de 1 a 5
public class Tarea {
    private String[] descripcion;
    private int prioridad;
    private boolean completa;
    private Date fechaLimite;
    public Tarea(){
         descripcion = new String[]{""};
         prioridad = 0;
         completa = false;
         fechaLimite = new Date();
    }
    public void setDescripcion(String[] descripcion){
        this.descripcion = descripcion;
    }
    public String[] getDescripcion(){
        return descripcion;
    }
    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    public int getPrioridad(){
        return prioridad;
    }
    public void setFechaLimite(Date fechaLimite){
        this.fechaLimite = fechaLimite;
    }
    public Date getFechaLimite(){
        return fechaLimite;
    }
}
