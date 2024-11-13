package M5;

import javax.swing.*;

public class M5E3 {
    public static void main(String[] args) {

        int numRandom = (int) (Math.random() * 10);
        int num = 0;
        int numIntentos = 0, maxIntentos = 5;

        while (num != numRandom && numIntentos < maxIntentos) {
            numIntentos++;

            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Intenta adivinar el numero entre el 1 y 10", "Numero de intentos: " + numIntentos, JOptionPane.QUESTION_MESSAGE));

            if (num == numRandom) {
                JOptionPane.showMessageDialog(null, "Enhorabuena, el número era " + numRandom, "Numero de intentos: " + numIntentos, JOptionPane.INFORMATION_MESSAGE);
            } else if (num > 10 || num < 1) {
                JOptionPane.showMessageDialog(null, "El número debe ser entre 1 y 10", "Numero de intentos: " + numIntentos, JOptionPane.WARNING_MESSAGE);
            } else if (numIntentos >= maxIntentos) {
                JOptionPane.showMessageDialog(null, "Lo siento, has superado el número de intentos. El numero era: " + numRandom, "Numero de intentos: " + numIntentos, JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Lo siento, vuelve a intentarlo", "Numero de intentos: " + numIntentos, JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
