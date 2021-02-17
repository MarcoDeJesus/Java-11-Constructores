package clases;

public class Vaso {
    public String color;
    public int capacidad;

    public Vaso(){
        this("Rojo");
    }

    public Vaso(String color){
        this(250, color);
    }

    public Vaso(int capacidad){
        this(capacidad, "Transparente");
    }

    public Vaso(int capacidad, String color){
        this.color = color;
        this.capacidad = capacidad;
    }
}
