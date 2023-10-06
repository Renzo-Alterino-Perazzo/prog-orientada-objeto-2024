package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Club {
    private ArrayList<Socio> socios;
    private Suscripcion suscripcionBasica;
    private Suscripcion suscripcionIntermedia;
    private Suscripcion suscripcionDestacada;

    public Club() {
        suscripcionBasica = new Suscripcion(Suscripcion.Nivel.BASICA, 100);
        suscripcionIntermedia = new Suscripcion(Suscripcion.Nivel.INTERMEDIA, 200);
        suscripcionDestacada = new Suscripcion(Suscripcion.Nivel.DESTACADA, 300);
    }
    public void agregarSocio(String nombre, String apellido, String dni, String direccion, String email, String suscripcion, LocalDate fechaInscripcion) {
        Suscripcion.Nivel nivelSuscripcion = Suscripcion.Nivel.valueOf(suscripcion.toUpperCase());
        Socio nuevoSocio = new Socio(nombre, apellido, dni, direccion, email, nivelSuscripcion,fechaInscripcion);
        socios.add(nuevoSocio);
    }
    public void reporteMensual(int mes) {
        System.out.printf("--- REPORTE MENSUAL---");
        System.out.println(mes);
        for (Socio socio : socios) {
            int mesInscripcion = socio.getFechaInscripcion().getMonthValue();
            if (mesInscripcion == mes) {
                System.out.println(socio.getNombre());
            }
        }
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }
}

