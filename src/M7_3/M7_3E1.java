package M7_3;

import javax.swing.*;

public class M7_3E1 {
    public static void main(String[] args) {
        float side;
        float base;
        float height;
        float radius;
        float result;
        boolean continueProgram = true;
        int finalAnswer;
        int option;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige una opcion para calcular el area de una figura: \n1. Cuadrado \n2. Triangulo \n3. Rectangulo \n4. Circulo \n0. Salir", "Calculo de areas", JOptionPane.QUESTION_MESSAGE));

            switch (option) {
                case 1:
                    side = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el lado del cuadrado: ", "Calculo de areas", JOptionPane.QUESTION_MESSAGE));
                    result = squareArea(side);
                    JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + result, "Calculo de areas", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    base = Float.parseFloat(JOptionPane.showInputDialog(null, "introduce la base del triangulpo: ", "Calculo de areas", JOptionPane.QUESTION_MESSAGE));
                    height = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la altura del triangulo: ", "Calculo de areas", JOptionPane.QUESTION_MESSAGE));
                    result = triangleArea(base, height);
                    JOptionPane.showMessageDialog(null, "El area del triangulo es: " + result, "Calculo de areas", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    base = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la base del rectangulo: ", "Calculo de areas", JOptionPane.QUESTION_MESSAGE));
                    height = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la altura del rectangulo: ", "Calculo de areas", JOptionPane.QUESTION_MESSAGE));
                    result = rectangleArea(base, height);
                    JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + result, "Calculo de areas", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    radius = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el radio del circulo: ", "Calculo de areas", JOptionPane.QUESTION_MESSAGE));
                    result = circleArea(radius);
                    JOptionPane.showMessageDialog(null, "El area del circulo es: " + result, "Calculo de areas ", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...", "Calculo de areas", JOptionPane.INFORMATION_MESSAGE);
                    continueProgram = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Seleciona entre el 0 y el 5 ", "Calculo de areas", JOptionPane.ERROR_MESSAGE);

                    if (JOptionPane.showConfirmDialog(null, "¿Quieres realizar otra operación?", "Continuar", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
                        continueProgram = false;
                    }
            }
        } while (continueProgram);

    }

    public static float squareArea(float side) {
        return side * side;
    }

    public static float triangleArea(float base, float height) {
        return base * height / 2;
    }

    public static float rectangleArea(float base, float height) {
        return base * height;
    }

    public static float circleArea(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
    }


}

