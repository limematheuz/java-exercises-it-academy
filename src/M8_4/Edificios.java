package M8_4;

public class Edificios {
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
        int tiempo = this.superficie / 5;
        int tiempoAdicional = (int) ((this.numPlantas - 1) * 0.5);
        return tiempo + tiempoAdicional;
    }

    public int costeMensual() {
        int costeDiario = 60;
        int costeMensual = costeDiario * 30;
        return costeMensual;
    }

//    public int vigiliancia() {
//        int vigilantesNecesarios = this.superficie/1000;
//        int
//
//    }
}
