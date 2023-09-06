import ar.edu.unlu.poo.Tarea;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        LocalDate ayer = LocalDate.now().minusDays(1);
        LocalDate maniana = LocalDate.now().plusDays(1);

        Tarea Supermercado = new Tarea();
        Supermercado.setDescripcion("Ir al supermercado");
        Supermercado.setFechaLimite(ayer);
        Supermercado.setFechaRecordatorio(ayer.minusDays(1));
        Supermercado.setCompletada(false);

        Tarea Auto = new Tarea();
        Auto.setDescripcion("Consultar repuesto del auto");
        Auto.setFechaLimite(ayer);
        Auto.setCompletada(true);

        Tarea Cine = new Tarea();
        Cine.setDescripcion("Ir al cine a ver la nueva película de Marvel");
        Cine.setFechaLimite(ayer);
        Cine.setFechaRecordatorio(ayer.minusDays(1));
        Cine.setCompletada(false);

        Supermercado.mostrarVencida();
        System.out.println("Vencida: "+ Supermercado.vencida());
        System.out.println("Completada: "+ Supermercado.completada());
        System.out.println("");

        Auto.mostrarVencida();
        System.out.println("Vencida: "+ Auto.vencida());
        System.out.println("Completada: "+Auto.completada());
        System.out.println("");

        Cine.mostrarVencida();
        System.out.println("Vencida: " + Cine.vencida());
        System.out.println("Completada: " + Cine.completada());
        System.out.println("");
    }
}