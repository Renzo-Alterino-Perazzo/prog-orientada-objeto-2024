package ar.edu.unlu.poo;
import java.util.ArrayList;
public class ListaTareas {
    private ArrayList<Tarea> tareas;

    public ListaTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareas() {
        System.out.println("Lista de Tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            Tarea tarea = tareas.get(i);
            System.out.println(i + ". " + tarea.getDescripcion() + " " );
        }
    }
}