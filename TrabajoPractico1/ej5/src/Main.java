import ar.edu.unlu.poo.Tarea;
import ar.edu.unlu.poo.ListaTareas;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ListaTareas listaTareas = new ListaTareas();

        // Crear las tareas
        LocalDate fechaManana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);

        Tarea tarea1 = new Tarea("Ir al supermercado mañana", 2, fechaManana);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", 1, fechaAyer);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", 3, fechaAyer);

        // Configurar el estado de las tareas
        tarea2.cambiarCompletado(true);
        tarea3.cambiarCompletado(true);

        // Agregar tareas a la lista
        listaTareas.agregarTarea(tarea1);
        listaTareas.agregarTarea(tarea2);
        listaTareas.agregarTarea(tarea3);

        // Mostrar la lista de tareas
        listaTareas.mostrarTareas();
    }
}