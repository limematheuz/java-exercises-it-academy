package M8_4;

import javax.swing.*;

public class Hotel extends Edificios {
    private int numHabitaciones;

    public Hotel(String nombre, int numPlantas, int superficie, int numHabitaciones) {
        super(nombre, numPlantas, superficie);
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void calcularServicioHabitaciones() {
        int personasNecesarias = (int) Math.ceil((float) numHabitaciones / 10);
        int sueldoTotal = personasNecesarias * 1000;
        JOptionPane.showMessageDialog(null, "Se necesitan " + personasNecesarias + " personas para atender las habitaciones. El sueldo total es de " + sueldoTotal + "€.");
    }

    @Override
    public int calcularCosteVigilancia() {
        int vigilantes = (int) Math.ceil((float) getSuperficie() / 1000);
        return vigilantes * (1300 + 500);
    }
}
