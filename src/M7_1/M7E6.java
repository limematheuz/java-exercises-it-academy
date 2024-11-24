package M7_1;

import javax.swing.*;

public class M7E6 {
    public static void main(String[] args) {

        int numUser = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero entero entre 1 y 10", "Vamos a multiplicar", JOptionPane.QUESTION_MESSAGE));

        String tablaMultiplicar = "";

        if (numUser < 1 || numUser > 10) {
            JOptionPane.showMessageDialog(null, "El número debe ser entre 1 y 10", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        for (int i = 1; i <= 10; i++) {
            tablaMultiplicar += numUser + " x " + i + " = " + numUser * i + "\n";
        }

        JOptionPane.showMessageDialog(null, "La tabla de multiplicar del " + numUser + " es: " + "\n" + tablaMultiplicar, "Tabla de multiplicar", JOptionPane.INFORMATION_MESSAGE);
    }
}
