package ar.edu.unlu.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaTareas {
    private ArrayList<Tarea> listaTareas;
    private ArrayList<Colaborador> colaboradores;
    Scanner buffer = new Scanner(System.in);
    LocalDate hoy = LocalDate.now();

    public ListaTareas(){
        listaTareas = new ArrayList<>();
        colaboradores = new ArrayList<>();
        String opcion;

        do {
            hoy = LocalDate.now();
            chequearVencimiento();
            menu();
            opcion = buffer.nextLine();
            switch (opcion) {
                case "1" -> nuevaTarea();
                case "2" -> mostrarTareas(listaTareas);
                case "3" -> cambiarDescripcion();
                case "4" -> cambiarPrioridad();
                case "5" -> cambiarEstado();
                case "6" -> consultarEstado();
                case "7" -> {
                    if (listaTareas != null) {
                        mostrarTareas(ordenarNoVencidas());
                    }
                }
                case "8" -> terminarTarea();
                case "9" -> mostrarTareasColaborador();
            }
        } while (!opcion.equals("0"));
    }

    private void chequearVencimiento(){
        Iterator<Tarea> iteradorLista = listaTareas.iterator();
        Tarea tarea;
        int i = 0;
        while (iteradorLista.hasNext()){
            tarea = iteradorLista.next();
            if (tarea.getFechaRecordatorio().isAfter(hoy) || tarea.getFechaRecordatorio().isEqual(hoy)){
                tarea.cambiarPrioridad("1");
                listaTareas.set(i, tarea);
            }
            i++;
        }
    }

    private void menu(){
        System.out.println();
        System.out.println("\t\t Menú");
        System.out.println("\t 1 - Agregar tarea");
        System.out.println("\t 2 - Mostrar tareas");
        System.out.println("\t 3 - Cambiar descripción");
        System.out.println("\t 4 - Cambiar prioridad");
        System.out.println("\t 5 - Cambiar estado");
        System.out.println("\t 6 - Consultar estado");
        System.out.println("\t 7 - Mostrar tareas no vencidas");
        System.out.println("\t 8 - Marcar tarea como terminada");
        System.out.println("\t 9 - Mostrar tareas de un colaborador determinado");
        System.out.println();
        System.out.println("\t 0 - Salir");

    }

    private void nuevaTarea(){
        System.out.println("Ingrese la descripción de la tarea:");
        String descripcion = buffer.nextLine();
        System.out.println("Ingrese la prioridad (1 = muy alta | 5 = muy baja):");
        String prioridad = buffer.nextLine();
        System.out.println("Ingrese la fecha límite: (dd/MM/yy)");
        String fechaLimite = buffer.nextLine();
        System.out.println("Ingrese la fecha de recordatorio: (dd/MM/yy)");
        String fechaRecordatorio = buffer.nextLine();

        agregarTarea(descripcion, prioridad, fechaLimite, fechaRecordatorio);
    }

    private void agregarTarea(String descripcion, String prioridad, String fechaLimite, String fechaRecordatorio){
        Tarea nuevaTarea = new Tarea(descripcion, prioridad, fechaLimite, fechaRecordatorio);

        ArrayList<Colaborador> colaboradoresTarea = new ArrayList<>();
        System.out.println("¿Desea agregar colaboradores? (S/n)");
        String opcion = buffer.nextLine();

        if (opcion.equals("S") || opcion.equals("s") || opcion.isEmpty()) {
            Colaborador colaborador;
            do {
                System.out.println("Ingrese el nombre del colaborador.");
                String nombreColaborador = buffer.nextLine();
                colaborador = buscarColaborador(nombreColaborador);
                if (colaborador == null) {
                    colaborador = new Colaborador(nombreColaborador);
                    colaborador.asignarTarea(nuevaTarea);
                    colaboradores.add(colaborador);
                }
                colaboradoresTarea.add(colaborador);
                System.out.println("¿Desea agregar otro colaborador? (S/n)");
                opcion = buffer.nextLine();
            } while (opcion.equals("S") || opcion.equals("s") || opcion.isEmpty());
        }

        nuevaTarea.agregarColaborador(colaboradores);
        listaTareas.add(nuevaTarea);
    }

    private void mostrarTareas(ArrayList<Tarea> lista){
        if (lista.isEmpty()){
            return;
        }
        Iterator<Tarea> iteradorLista = lista.iterator();
        int i = 1;
        while (iteradorLista.hasNext()){
            System.out.print(i + " - ");
            iteradorLista.next().mostrarTarea();
            i++;
        }
    }

    private void cambiarDescripcion(){
        System.out.println("Inserte el número de la tarea a modificar su descripción.");
        int numeroTarea = Integer.parseInt(buffer.nextLine()) - 1;
        System.out.println("Inserte la nueva descripción de la tarea " + numeroTarea);
        String nuevaDescripcion = buffer.nextLine();
        Tarea tarea = listaTareas.get(numeroTarea);
        tarea.cambiarDescripcion(nuevaDescripcion);
        listaTareas.set(numeroTarea, tarea);
        System.out.printf("Descripción cambiada: ");
        tarea.mostrarTarea();
    }

    private void cambiarPrioridad(){
        System.out.println("Inserte el número de la tarea a modificar su prioridad.");
        int numeroTarea = Integer.parseInt(buffer.nextLine()) - 1;
        System.out.println("Inserte la nueva prioridad de la tarea " + numeroTarea + " (1 = muy alta | 5 = muy baja)");
        String nuevaPrioridad = buffer.nextLine();
        Tarea tarea = listaTareas.get(numeroTarea);
        tarea.cambiarPrioridad(nuevaPrioridad);
        listaTareas.set(numeroTarea, tarea);
        System.out.println("Prioridad cambiada.");
    }

    private void cambiarEstado(){
        System.out.println("Inserte el número de la tarea a modificar su estado.");
        int numeroTarea = Integer.parseInt(buffer.nextLine()) - 1;
        System.out.println("Inserte el nuevo estado de la tarea " + numeroTarea + " (true = terminada | false = incompleta");
        String nuevoEstado = buffer.nextLine();
        Tarea tarea = listaTareas.get(numeroTarea);
        tarea.cambiarEstado(nuevoEstado);
        listaTareas.set(numeroTarea, tarea);
        System.out.println("Estado cambiado:");
        tarea.mostrarTarea();
    }

    private void consultarEstado(){
        System.out.println("Inserte el número de la tarea a consultar su estado.");
        int numeroTarea = Integer.parseInt(buffer.nextLine()) - 1;
        Tarea tarea = listaTareas.get(numeroTarea);
        numeroTarea++;
        if (tarea.getEstado().equals(true)){
            System.out.println("La tarea " + numeroTarea + " está completa.");
        } else if (tarea.getFechaLimite().isBefore(LocalDate.now())){
            System.out.println("La tarea " + numeroTarea + " está vencida.");
        } else System.out.println("La tarea " + numeroTarea + " está incompleta");
    }

    private Tarea buscarTareaMayor(ArrayList<Tarea> listaTareas){
        if (listaTareas.isEmpty()){
            return null;
        }

        Iterator<Tarea> iteratorTarea = listaTareas.iterator();
        Tarea tarea = iteratorTarea.next();
        int prioridad = (int) tarea.getPrioridad();
        LocalDate fecha = tarea.getFechaLimite();
        Tarea tareaAComparar;
        int prioridadAComparar;
        LocalDate fechaAComparar;

        while (iteratorTarea.hasNext()){
            tareaAComparar = iteratorTarea.next();
            prioridadAComparar = (int) tareaAComparar.getPrioridad();
            fechaAComparar = tareaAComparar.getFechaLimite();
            if (prioridadAComparar < prioridad || (prioridadAComparar == prioridad && fechaAComparar.isBefore(fecha))) {
                    tarea = tareaAComparar;
                    prioridad = prioridadAComparar;
                    fecha = fechaAComparar;
            }
        }
        return tarea;
    }

    private ArrayList<Tarea> ordenarNoVencidas(){
        ArrayList<Tarea> noVencidasOrdenadas = new ArrayList<>();

        // ordena primero por prioridad y luego por fecha de vencimiento;
        if (listaTareas.isEmpty()){
            return noVencidasOrdenadas;
        }

        ArrayList<Tarea> tareasNoVencidas = listarTareasNoVencidas();
        Tarea tarea;

        while (!tareasNoVencidas.isEmpty()){
            tarea = buscarTareaMayor(tareasNoVencidas);
            tareasNoVencidas.remove(tarea);
            noVencidasOrdenadas.add(tarea);
        }

        return noVencidasOrdenadas;
    }

    private ArrayList<Tarea> listarTareasNoVencidas(){
        ArrayList<Tarea> tareasNoVencidas = new ArrayList<>();
        Iterator<Tarea> iteradorTareas = listaTareas.iterator();
        Tarea tarea;
        boolean estaTerminada;
        LocalDate fechaVencimiento;
        while (iteradorTareas.hasNext()){
            tarea = iteradorTareas.next();
            estaTerminada = (boolean) tarea.getEstado();
            fechaVencimiento = tarea.getFechaLimite();
            if (!estaTerminada || fechaVencimiento.isAfter(hoy)){
                tareasNoVencidas.add(tarea);
            }
        }
        return tareasNoVencidas;
    }

    private Colaborador buscarColaborador(String colaboradorABuscar){
        Iterator<Colaborador> iteradorColaboradores = colaboradores.iterator();
        Colaborador colaborador;
        String nombreColaborador;
        while (iteradorColaboradores.hasNext()){
            colaborador = iteradorColaboradores.next();
            nombreColaborador = colaborador.getNombre().toString();
            if (nombreColaborador.equals(colaboradorABuscar)){
                return colaborador;
            }
        }
        return null;
    }

    private void terminarTarea(){
        System.out.println("Ingrese el número de la tarea a marcar como terminada:");
        int numeroTarea = Integer.parseInt(buffer.nextLine()) - 1;

        Tarea tarea = listaTareas.get(numeroTarea);

        System.out.println("Ingrese el nombre del colaborador:");
        String nombre = buffer.nextLine();
        Colaborador colaborador = buscarColaborador(nombre);
        if (colaborador != null){
            tarea.terminarTarea(colaborador);
        } else System.out.println("El colaborador ingresado no existe.");

        listaTareas.set(numeroTarea, tarea);
    }

    private void mostrarTareasColaborador(){
        System.out.println("Ingrese el nombre del colaborador:");
        String nombre = buffer.nextLine();
        Colaborador colaborador = buscarColaborador(nombre);
        if (colaborador != null){
            colaborador.mostrarTareas();
        } else System.out.println("El colaborador ingresado no existe.");
    }

}
