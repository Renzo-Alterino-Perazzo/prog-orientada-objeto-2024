import ar.edu.unlu.poo.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Club miClub = new Club();

        miClub.agregarSocio("Juan", "Perez", "12345678", "Calle 123", "juan@example.com", "BASICA",LocalDate.of(2023,1,15));
        miClub.agregarSocio("Maria", "Gomez", "87654321", "Avenida 456", "maria@example.com", "DESTACADA",LocalDate.of(2023,1,15));
        miClub.reporteMensual(1);
    }
}