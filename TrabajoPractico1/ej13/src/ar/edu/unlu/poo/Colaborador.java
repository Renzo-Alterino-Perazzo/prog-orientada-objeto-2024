package ar.edu.unlu.poo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Colaborador {
    private String nombre;
    private ArrayList<Tarea> tareas = new ArrayList<>();;
    Scanner buffer = new Scanner(System.in);

    public Colaborador(){
        System.out.println("Ingrese el nombre del colaborador:");
        nombre = buffer.nextLine();
    }

    public void mostrarTareas(){
        Iterator<Tarea> iteratorTareas = tareas.iterator();
        while (iteratorTareas.hasNext()){
            iteratorTareas.next().mostrarTarea();
        }
    }

    public Colaborador(String nombre){
        this.nombre = nombre;
    }

    public void asignarTarea(Tarea tarea){
        tareas.add(tarea);
    }

    public Object getNombre(){
        return nombre;
    }

}
