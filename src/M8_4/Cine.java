package M8_4;

import javax.swing.*;

public class Cine extends Edificios {
    private int aforoMax;

    public Cine(String nombre, int numPlantas, int superficie, int aforoMax) {
        super(nombre, numPlantas, superficie);
        this.aforoMax = aforoMax;
    }

    public int getAforoMax() {
        return aforoMax;
    }

    public int proyectarSesion(int asistentes, int precioEntrada) {
        if (asistentes > aforoMax) {
            JOptionPane.showMessageDialog(null, "Error: El número de asistentes supera el aforo máximo.");
            return 0;
        }
        return asistentes * precioEntrada;
    }

    @Override
    public int calcularCosteVigilancia() {
        int vigilantes = (int) Math.ceil((float) getSuperficie() / 1000);
        return vigilantes * 1300;
    }
}

