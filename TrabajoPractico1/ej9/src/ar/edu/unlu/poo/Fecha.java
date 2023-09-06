package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    public static LocalDate fechaTexto(String dateStr, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(dateStr, formatter);
    }

    public static boolean fechaEntre(LocalDate date, LocalDate startDate, LocalDate endDate) {
        return (date.isEqual(startDate) || date.isAfter(startDate)) && (date.isEqual(endDate) || date.isBefore(endDate));
    }

    public static boolean fechaDespues(LocalDate date1, LocalDate date2) {
        return date1.isAfter(date2);
    }

    public static boolean fechaAnterior(LocalDate date1, LocalDate date2) {
        return date1.isBefore(date2);
    }
}