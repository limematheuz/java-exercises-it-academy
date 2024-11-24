package M7_2;

import javax.swing.*;
import java.util.ArrayList;

public class M7_2E8 {
    public static void main(String[] args) {

        int totalNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros queires que contenga la lista de fibonacci?", "Fibonacci", JOptionPane.QUESTION_MESSAGE));

        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer número de la sucesión:", "Fibonacci", JOptionPane.QUESTION_MESSAGE));
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo número de la sucesión:", "Fibonacci", JOptionPane.QUESTION_MESSAGE));

        ArrayList<Integer> fibonacciListResult = fibonacci(totalNumber, firstNumber, secondNumber);
        JOptionPane.showMessageDialog(null, fibonacciListResult);
    }

    public static ArrayList<Integer> fibonacci(int n, int firstNumber, int secondNumber) {
        ArrayList<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(firstNumber);
        fibonacciList.add(secondNumber);
        for (int i = 2; i < n; i++) {
            fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
        }
        return fibonacciList;
    }
}
