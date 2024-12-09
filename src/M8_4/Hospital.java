package M8_4;

public class Hospital extends Edificios {
    private int numEnfermos;

    public Hospital(String nombre, int numPlantas, int superficie, int numEnfermos) {
        super(nombre, numPlantas, superficie);
        this.numEnfermos = numEnfermos;
    }

    public int getNumEnfermos() {
        return numEnfermos;
    }

    public String repartirAlmuerzos() {
        return "Se estan repartiendo " + this.numEnfermos * 3 + " raciones ";
    }

    @Override
    public int calcularCosteVigilancia() {
        int vigilantes = (int) Math.ceil((float) getSuperficie() / 1000);
        return vigilantes * 1000;
    }
}
