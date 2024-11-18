package M5;

import javax.swing.*;

public class M5EEXTRA1 {
    public static void main(String[] args) {

        int numRandom = (int) (Math.random() * 500) + 1;
        System.out.println(numRandom);

        int numUser = 0;
        int coldDistance = 50;
        int warmDistance = 20;
        int hotDistance = 15;

        while (numUser != numRandom) {
            numUser = Integer.parseInt(JOptionPane.showInputDialog("Adivina un numero entre 1 y 500"));

            if (numUser < 1 || numUser > 500) {
                JOptionPane.showMessageDialog(null, "El número introducido no es válido. Debe estar entre 1 y 500.", "Error", JOptionPane.ERROR_MESSAGE);
//                continue;
            }

            int distance = Math.abs(numUser - numRandom);

            if (distance == 0) {
                JOptionPane.showMessageDialog(null, "Enhorabuena, el número era " + numRandom, "", JOptionPane.INFORMATION_MESSAGE);
//                break;
            }
            if (distance >= coldDistance) {
                if (numUser > numRandom) {
                    JOptionPane.showMessageDialog(null, "Frío: tu número es menor", "Frio", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Frío: tu número es mayor", "Frio", JOptionPane.ERROR_MESSAGE);
                }
            } else if (distance >= warmDistance) {
                if (numUser > numRandom) {
                    JOptionPane.showMessageDialog(null, "Tibio: tu número es menor", "Tibio", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Tibio: tu número es mayor", "Tibio", JOptionPane.WARNING_MESSAGE);
                }
            } else if (distance < hotDistance) {
                if (numUser > numRandom) {
                    JOptionPane.showMessageDialog(null, "Caliente: tu número es menor", "Caliente", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Caliente: tu número es mayor", "Caliente", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }
}

