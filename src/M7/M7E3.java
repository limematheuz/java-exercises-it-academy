package M7;

import javax.swing.*;

public class M7E3 {
    public static void main(String[] args) {
        float dividendo;
        float divisor;
        float result;
        boolean continuar = true;
        int respuestaFinal;

        do {
            dividendo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un numero dividendo: "));
            divisor = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un numero divisor: "));

            if (divisor < 2 || divisor > 7) {
                JOptionPane.showMessageDialog(null, "El divisor debe estar entre 2 y 7");
            } else if (esMultiplo(dividendo, divisor)) {
                result = division(dividendo, divisor);
                JOptionPane.showMessageDialog(null, "El numero " + dividendo + " es multiplo de " + divisor + "\nEl resultado de la division es: " + result);
            } else {
                result = division(dividendo, divisor);
                JOptionPane.showMessageDialog(null, "El numero " + dividendo + " no es multiplo de " + divisor + "\nEl resultado de la division es: " + result);
            }

            respuestaFinal = JOptionPane.showConfirmDialog(null, "¿Quieres realizar otra operación?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuestaFinal != JOptionPane.YES_OPTION) {
                continuar = false;
            }
        } while (continuar);

    }

    public static float division(float a, float b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
            return 0;
        } else {
            return a / b;
        }
    }

    public static boolean esMultiplo(float a, float b) {
        return a % b == 0;

    }
}

