import ar.edu.unlu.poo.Tarea;
import ar.edu.unlu.poo.TareaManejar;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TareaManejar tareaManejar = new TareaManejar();
        Tarea tarea1 = new Tarea();
        tarea1.setDescripcion("Ir al supermercado");
        tarea1.setPrioridad(2);
        tarea1.setFechaLimite(LocalDate.now().plusDays(4));
        tarea1.setFechaRecordatorio(LocalDate.now().plusDays(3));
        tarea1.setCompletada(false);
        tareaManejar.agregarTarea(tarea1);
        Tarea tarea2 = new Tarea();
        tarea2.setDescripcion("Ir al cine");
        tarea2.setPrioridad(3);
        tarea2.setFechaLimite(LocalDate.now().plusDays(1));
        tarea2.setFechaRecordatorio(LocalDate.now());
        tarea2.setCompletada(false);
        tareaManejar.agregarTarea(tarea2);
        Tarea tarea3 = new Tarea();
        tarea3.setDescripcion("Comprar cuadernos");
        tarea3.setPrioridad(1);
        tarea3.setFechaLimite(LocalDate.now());
        tarea3.setFechaRecordatorio(LocalDate.now().minusDays(1));
        tarea3.setCompletada(true);
        tareaManejar.agregarTarea(tarea3);
        Tarea tarea4 = new Tarea();
        tarea4.setDescripcion("Ir al mecanico");
        tarea4.setPrioridad(1);
        tarea4.setFechaLimite(LocalDate.now().plusDays(2));
        tarea4.setFechaRecordatorio(LocalDate.now());
        tarea4.setCompletada(true);
        tareaManejar.agregarTarea(tarea4);
        tareaManejar.mostarTarea();
    }
}