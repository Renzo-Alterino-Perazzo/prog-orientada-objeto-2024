public class Bolita {
    //atributo
    private String color;
    private int posicion;
    //metodos
    //construye bolita
    public Bolita();
    //obtiene color
    public String getColor();
    //obitene posicion
    public int getPosicion();

    public void setPosicion(int posicion);
    public void setColor(String color);
}

public class Tablero {
    //atributos
    private Bolita[] codigo = new Bolita[[5];
    //
    //construye tablero
    public Tablero();
    public Bolita[] getCodigo();
}

//jugador
public class Jugador {
    //atributos
    private String nombre;
    private int puntaje;
    //construye jugador
    public Jugador(String nombre, int puntaje);
    public int getPuntaje();
    public String getNombre();
    public void setNombre(String nombre);
    public void setPuntaje(int puntaje)
}