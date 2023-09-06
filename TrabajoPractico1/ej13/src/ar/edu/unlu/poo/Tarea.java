package ar.edu.unlu.poo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Tarea {
    private Object descripcion; // string
    private int prioridad; // integer(1-5)
    private boolean estado; // boolean (true = terminada; false = incompleta)
    private ArrayList<Colaborador> listaColaboradores;
    private Colaborador colaboradorFinalizo;
    private LocalDate fechaLimite; // LocalDate
    private LocalDate fechaRecordatorio;
    private LocalDate fechaFinalizada;

    public Tarea(Object descripcion, Object prioridad, Object fechaLimite, Object fechaRecordatorio){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy");
        // set descripcion
        this.descripcion = descripcion.toString();
        // set prioridad
        if (prioridad instanceof Integer){
            this.prioridad = (int) prioridad;
        } else this.prioridad = Integer.parseInt(prioridad.toString());
        // set fechaLimite
        if (fechaLimite instanceof LocalDate){
            this.fechaLimite = (LocalDate) fechaLimite;
        } else this.fechaLimite = LocalDate.parse(fechaLimite.toString(), formato);
        // set fechaRecordatorio
        if (fechaRecordatorio instanceof LocalDate){
            this.fechaRecordatorio = (LocalDate) fechaRecordatorio;
        } else this.fechaRecordatorio = LocalDate.parse(fechaRecordatorio.toString(), formato);
        // set estado
        this.estado = false;
        listaColaboradores = new ArrayList<>();
        fechaFinalizada = null;
    }

    public void mostrarTarea(){
        LocalDate hoy = LocalDate.now();
        if (fechaRecordatorio.isEqual(hoy) || fechaRecordatorio.isAfter(hoy)){
            System.out.println("(Por vencer) " + descripcion);
        } else if (estado){
            System.out.println("(Terminada) " + descripcion);
        } else if (!estado && fechaLimite.isBefore(LocalDate.now())){
            System.out.println("(Vencida) " + descripcion);
        } else System.out.println(descripcion);
    }

    public void cambiarDescripcion(Object descripcion){
        this.descripcion = descripcion.toString();
    }

    public void cambiarPrioridad(Object prioridad){
        if (prioridad instanceof Integer){
            this.prioridad = (int) prioridad;
        } else this.prioridad = Integer.parseInt(prioridad.toString());
    }

    public void cambiarEstado(Object estado){
        if (estado instanceof String){
            this.estado = Boolean.parseBoolean(estado.toString());
        } else this.estado = (boolean) estado;
    }

    public void agregarColaborador(Colaborador colaborador){
        listaColaboradores.add(colaborador);
    }

    public void agregarColaborador(ArrayList<Colaborador> colaboradores){
        listaColaboradores.addAll(colaboradores);
    }

    public void terminarTarea(Colaborador colaborador){
        estado = true;
        colaboradorFinalizo = colaborador;
        fechaFinalizada = LocalDate.now();
    }

    public Object getDescripcion() {
        return descripcion;
    }

    public Object getPrioridad() {
        return prioridad;
    }

    public Object getEstado() {
        return estado;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
    }
}
