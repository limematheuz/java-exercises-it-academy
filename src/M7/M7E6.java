package M7;

import javax.swing.*;
import java.util.ArrayList;

public class M7E6 {
    public static void main(String[] args) {

        int numUser = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero entero entre 1 y 10", "Vamos a multiplicar", JOptionPane.QUESTION_MESSAGE));

        int limiter = (numUser < 10) ? numUser : 1;

        ArrayList<String> tablaMultiplicar = new ArrayList<>();

        String multiplicacion = null;
        for (int i = 1; i <= 10; i++) {
            multiplicacion = "\n" + (limiter + " x " + i + " = " + (numUser * i));
            tablaMultiplicar.add(multiplicacion);
        }

        JOptionPane.showMessageDialog(null, "La tabla de multiplicar de es: \n" + multiplicacion, "Tabla de multiplicar", JOptionPane.INFORMATION_MESSAGE);
    }
}
