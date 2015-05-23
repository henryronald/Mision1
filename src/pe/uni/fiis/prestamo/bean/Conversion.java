package pe.uni.fiis.prestamo.bean;

/**
 * Created by Henry on 22/05/2015.
 */
public class Conversion {
    private String tasaOrigen;
    private String tasaDestino;
    private Float valor;

    public Conversion(String tasaOrigen, String tasaDestino, Float valor) {
        this.tasaOrigen = tasaOrigen;
        this.tasaDestino = tasaDestino;
        this.valor = valor;
    }

    public Conversion(String tasaOrigen, String tasaDestino) {
        this.tasaOrigen = tasaOrigen;
        this.tasaDestino = tasaDestino;
    }

    public Conversion(Float valor) {
        this.valor = valor;
    }

    public String getTasaOrigen() {
        return tasaOrigen;
    }

    public void setTasaOrigen(String tasaOrigen) {
        this.tasaOrigen = tasaOrigen;
    }

    public String getTasaDestino() {
        return tasaDestino;
    }

    public void setTasaDestino(String tasaDestino) {
        this.tasaDestino = tasaDestino;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
