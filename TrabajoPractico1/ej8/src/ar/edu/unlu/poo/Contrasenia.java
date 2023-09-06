package ar.edu.unlu.poo;
import java.security.SecureRandom;
import java.lang.StringBuilder;

public class Contrasenia {
    private static final String minusculas = "abcdefghijklmnopqrstuvwxyz";
    private static final String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";

    private int longitud;
    private String password;

    public Contrasenia(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    private void generarPassword() {
        SecureRandom random = new SecureRandom();
        StringBuilder newPassword = new StringBuilder();

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int numberCount = 0;

        for (int i = 0; i < longitud; i++) {
            int category = random.nextInt(3);

            switch (category) {
                case 0:
                    newPassword.append(minusculas.charAt(random.nextInt(minusculas.length())));
                    lowercaseCount++;
                    break;
                case 1:
                    newPassword.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
                    uppercaseCount++;
                    break;
                case 2:
                    newPassword.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
                    numberCount++;
                    break;
            }
        }
        //if (lowercaseCount < 2 || uppercaseCount < 1 || numberCount < 2) {
        //    generarPassword();
        //} else {
            password = newPassword.toString();
        //}
    }

    public String getPassword() {
        return password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public boolean isStrong() {
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int numberCount = 0;

        for (char c : password.toCharArray()) {
            if (minusculas.contains(String.valueOf(c))) {
                lowercaseCount++;
            } else if (mayusculas.contains(String.valueOf(c))) {
                uppercaseCount++;
            } else if (NUMBERS.contains(String.valueOf(c))) {
                numberCount++;
            }
        }
        return lowercaseCount >= 2 && uppercaseCount >= 1 && numberCount >= 2;
    }
}
