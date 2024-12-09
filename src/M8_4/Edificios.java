package M8_4;

public abstract class Edificios {
    private String nombre;
    private int numPlantas;
    private int superficie;

    public Edificios(String nombre, int numPlantas, int superficie) {
        this.nombre = nombre;
        this.numPlantas = numPlantas;
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int limpiar() {
        int tiempo = superficie / 5;
        int tiempoAdicional = (int) ((this.numPlantas - 1) * 0.5);
        return tiempo + tiempoAdicional;
    }

    public abstract int calcularCosteVigilancia();
}
