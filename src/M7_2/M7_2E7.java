package M7_2;

import javax.swing.*;

public class M7_2E7 {
    public static void main(String[] args) {
        int finalAnswer;
        boolean continueProgram = true;
        int year;

        do {
            year = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrear fecha: ", "Debes ingresar una año en fotmato de 4 dígitos para saber si es bisiesto", JOptionPane.QUESTION_MESSAGE));

            if (esBisiesto(year)) {
                JOptionPane.showMessageDialog(null, "El año " + year + " es bisiesto", "Año bisiesto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El año " + year + " no es bisiesto", "Año no bisiesto", JOptionPane.INFORMATION_MESSAGE);
            }

            finalAnswer = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar otro año?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (finalAnswer != JOptionPane.YES_OPTION) {
                continueProgram = false;
            }
        } while (continueProgram);
    }

    public static boolean esBisiesto(int year) {
        return year % 4 == 0 && year != 100 || year % 400 == 0;
    }
}

//cualquier año divisible por 4 es bisiesto
//excepto si es divisible por 100
//pero si es divisible por 400 si es bisiesto

//entonces si el año es divisible por 4 y no es divisible por 100 o si es divisible por 400 es bisiesto
//si el año es divisible por 4 pero no es divisible por 100 no es bisiesto, pero si es divisible por 400 si es bisiesto

// si el año es divisible por 4 == bisiesto
// si el año es divisible por 100 == no bisiesto
// si el año es divisible por 400 == bisiesto

// si el año es divisible por 4 y no es divisible por 100 o si es divisible por 400 == bisiesto


//un año es bisiesto si es divisible por cuatro pero no es divisible por 100, excepto si es divisible por 400
//si un año es divisible por 4 y es divisible por 400 es bisiesto
//si un año es divisible 400 es bisiesto
//si un año es divisible por 400 y no es divisible por 100 es bisiesto
