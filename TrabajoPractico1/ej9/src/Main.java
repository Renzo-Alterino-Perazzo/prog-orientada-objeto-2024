import java.time.LocalDate;
import ar.edu.unlu.poo.Fecha;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = Fecha.fechaTexto("15-09-2023", "dd-MM-yyyy");
        LocalDate date2 = Fecha.fechaTexto("09-15-2023", "MM-dd-yyyy");

        // Determinar si una fecha se encuentra entre dos fechas
        LocalDate startDate = LocalDate.of(2023, 9, 1);
        LocalDate endDate = LocalDate.of(2023, 9, 30);
        boolean fechaEntre = Fecha.fechaEntre(date1, startDate, endDate);
        System.out.println("¿La fecha 15-09-2023 está entre 01-09-2023 y 30-09-2023? " + fechaEntre);

        // Determinar si una fecha es mayor que otra fecha
        boolean fechaDespues = Fecha.fechaDespues(date1, date2);
        System.out.println("¿La fecha 15-09-2023 es mayor que 09-15-2023? " + fechaDespues);

        // Determinar si una fecha es menor que otra fecha
        boolean fechaAnterior = Fecha.fechaAnterior(date2, date1);
        System.out.println("¿La fecha 09-15-2023 es menor que 15-09-2023? " + fechaAnterior);
    }
}