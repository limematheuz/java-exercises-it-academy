package M7;

import javax.swing.*;
import java.util.ArrayList;

public class M7E2 {
    public static void main(String[] args) {

        float numNotas = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce un numero de notas a introducir", "Introducir notas", JOptionPane.QUESTION_MESSAGE));

        float notasAlumnos = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la nota del alumno", "Introducir notas", JOptionPane.QUESTION_MESSAGE));

        ArrayList<Float> notas = new ArrayList<>();

        float resultado = 0;

        for (float i = 1; i <= numNotas; i++) {
            JOptionPane.showInputDialog(null, "Introduce la nota del alumno", "Introducir notas", JOptionPane.QUESTION_MESSAGE);
            notas.add(notasAlumnos);
            resultado += notasAlumnos;
        }

        JOptionPane.showMessageDialog(null, "Las notas introducidas son: " + notas, "Notas Introducidas", JOptionPane.INFORMATION_MESSAGE);
        for (float nota : notas) {
            JOptionPane.showMessageDialog(null, "Nota: " + nota, "Nota", JOptionPane.INFORMATION_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, "La media de las notas introducidas es: " + resultado / numNotas, "Media de las notas", JOptionPane.INFORMATION_MESSAGE);
    }
}
