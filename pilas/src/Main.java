import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public boolean StringEnArray (String cadena, ArrayList palabras) {
        ListIterator<String> iterador = palabras.listIterator(palabras.size());
        while (iterador.hasNext()) {
            String nextString = iterador.next();
            if (cadena.equals(nextString)) return true;
        }
        return false;
    }

    public int cantidadStringEnArray (String cadena, ArrayList caracteres) {
        int repeticiones = 0;
        ListIterator<String> iterador = caracteres.listIterator(caracteres.size());
        while (iterador.hasNext()) {
            String nextString = iterador.next();
            if (cadena.equals(nextString)) repeticiones++;
        }
        return repeticiones;
    }
}