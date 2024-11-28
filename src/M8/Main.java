package M8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ordenador ordenador1 = new Ordenador("HP", "Pavillon");
        Ordenador ordenador2 = new Ordenador("HP", "Pavillon", "Intel i7", 16, 512);
        Ordenador ordenador3 = new Ordenador("Lenovo", "YOGA", "Ryzen 7", 16, 512);

//        JOptionPane.showMessageDialog(null, ordenador1);
//        JOptionPane.showMessageDialog(null, ordenador2);
//        JOptionPane.showMessageDialog(null, ordenador3);

        ordenador1.setProcesador("AMD Ryzen 5");
        ordenador1.setMemoriaRAM(4);
        ordenador1.setCapacidadDiscoDuro(256);
        JOptionPane.showMessageDialog(null, ordenador1);

        JOptionPane.showMessageDialog(null, ordenador2.ejecutarPrograma("Intellij"));
    }
}
