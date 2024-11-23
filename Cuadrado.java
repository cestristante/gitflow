public class Cuadrado implements Figura {
    private int lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    /**
     * Constructor
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /* Getters & Setters */
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
}
