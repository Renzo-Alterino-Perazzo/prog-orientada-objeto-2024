package ar.edu.unlu.poo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TareaManejar {
    private List<Tarea> tareas;
    public TareaManejar(){
        tareas = new ArrayList<Tarea>();
    }
    public void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    public void mostarTarea(){
        for (int i = 0; i < tareas.size();i++){
            System.out.println("Descripcion: " + tareas.get(i).getDescripcion());
            System.out.println("Prioridad: " + tareas.get(i).getPrioridad());
            System.out.println("Completada: " + tareas.get(i).getCompletada());
            System.out.println("Fecha limite: "+ tareas.get(i).getFechaLimite());
            System.out.println("Fecha recordatorio: "+ tareas.get(i).getFechaRecordatorio());
        }
    }

    public void mostrarNoVencidas(){
        for (int i = 0; i < tareas.size();i++){
            if (tareas.get(i).vencida()==false){
                System.out.println("Descripcion: " + tareas.get(i).getDescripcion());
                System.out.println("Prioridad: " + tareas.get(i).getPrioridad());
                System.out.println("Completada: " + tareas.get(i).getCompletada());
                System.out.println("Fecha limite: "+ tareas.get(i).getFechaLimite());
                System.out.println("Fecha recordatorio: "+ tareas.get(i).getFechaRecordatorio());
            }
        }
    }
}