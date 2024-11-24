package M7_3;

import javax.swing.*;
import java.text.Normalizer;

public class M7_3E3 {
    public static void main(String[] args) {
        String userSentence = JOptionPane.showInputDialog(null, "Introduce una frase y determinaremos si es un palindromo", "Palindromo", JOptionPane.QUESTION_MESSAGE);

        String lowerSentence = userSentence.toLowerCase().trim();
        String cleanSentence = cleanText(lowerSentence);

        String reversedSentence = new StringBuilder(cleanSentence).reverse().toString();

        if (reversedSentence.equals(cleanSentence)){
            JOptionPane.showMessageDialog(null, "Si es una palindromo");
        }else {
            JOptionPane.showMessageDialog(null, "No es una palindromo");
        }
    }

    public static String cleanText(String text) {
        String normalizedText = Normalizer.normalize(text, Normalizer.Form.NFD);
        return normalizedText.replaceAll("[^a-z]", "");
    }
}
