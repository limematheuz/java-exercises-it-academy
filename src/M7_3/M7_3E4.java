package M7_3;

import javax.swing.*;

public class M7_3E4 {
    public static void main(String[] args) {
        String dniIntroducido = JOptionPane.showInputDialog(null, "Introduce un DNI para comprobar si la letra es correcta: ", "DNI", JOptionPane.QUESTION_MESSAGE);

        if (dniIntroducido != null && dniIntroducido.isEmpty()) {
            System.out.println("DNI introducido: " + dniIntroducido);
        } else {
            JOptionPane.showMessageDialog(null, "No has introducido un DNI valido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}