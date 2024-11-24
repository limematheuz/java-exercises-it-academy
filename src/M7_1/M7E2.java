package M7_1;

import javax.swing.*;
import java.util.ArrayList;

public class M7E2 {
    public static void main(String[] args) {

        float numNotas = Float.parseFloat(JOptionPane.showInputDialog(null, "Cuantas notas quieres introducir?", " Introducir numero de notas ", JOptionPane.QUESTION_MESSAGE));

        ArrayList<Float> notas = new ArrayList<>();

        float resultado = 0;

        for (int i = 1; i <= numNotas; i++) {
            float notaAlumnos = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la nota del alumno", "Introducir notas", JOptionPane.QUESTION_MESSAGE));
            notas.add(notaAlumnos);
            resultado += notaAlumnos;
        }

        JOptionPane.showMessageDialog(null, "Las notas introducidas son: \n" + notas, "Notas Introducidas", JOptionPane.INFORMATION_MESSAGE);

        float resultadoFinal = resultado / numNotas;

        JOptionPane.showMessageDialog(null, "La media de las notas introducidas es: " + resultadoFinal, "Media de las notas", JOptionPane.INFORMATION_MESSAGE);

        if (resultadoFinal < 5) {
            JOptionPane.showMessageDialog(null, "La nota media de la clase está suspendida. Los alumnos/as deberían preguntar sus dudas y trabajar más", "Resultado Final: ", JOptionPane.WARNING_MESSAGE);
        } else if (resultadoFinal < 7) {
            JOptionPane.showMessageDialog(null, "La nota media de la clase es buena, pero los alumnos/as deberían mejorar el trabajo personal", "Resultado Final: ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "¡Enhorabuena! La nota media de la clase se corresponde con el esfuerzo realizado", "Resultado Final: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
