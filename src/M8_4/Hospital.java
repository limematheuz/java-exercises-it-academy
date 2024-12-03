package M8_4;

public class Hospital {
    private int numEnfermos;

    public Hospital(int numEnfermos) {
        this.numEnfermos = numEnfermos;
    }

    public int getNumEnfermos() {
        return numEnfermos;
    }

    public String repartirAlmuerzos() {
        return "Se estan repartiendo " + this.numEnfermos * 3 + " raciones ";
    }
}
