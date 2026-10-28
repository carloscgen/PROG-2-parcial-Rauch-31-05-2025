import java.util.ArrayList;
import java.util.List;

public class Agente {
    private String nombre;
    private int anioExp;
    private double velocidad;
    private double ingenio;
    private List<String> habilidades;

    public Agente(String nombre, int anioExp, double velocidad, double ingenio) {
        this.nombre = nombre;
        this.anioExp = anioExp;
        this.velocidad = velocidad;
        this.ingenio = ingenio;
        this.habilidades = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getAnioExp() {
        return this.anioExp;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public double getIngenio() {
        return this.ingenio;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

}
