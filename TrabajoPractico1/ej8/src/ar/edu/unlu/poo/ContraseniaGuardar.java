package ar.edu.unlu.poo;
import java.util.List;
import java.util.ArrayList;
public class ContraseniaGuardar {
    private List<Contrasenia> passwords;

    public ContraseniaGuardar(int cantidad, int longitud) {
        passwords = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            passwords.add(new Contrasenia(longitud));
        }
    }

    public void showPasswordsStrength() {
        for (Contrasenia password : passwords) {
            String strength = password.isStrong() ? "Fuerte" : "Débil";
            System.out.println(password.getPassword() + " - " + strength);
        }
    }

    public List<Contrasenia> getPasswords() {
        return passwords;
    }
}