package M5;

import java.util.ArrayList;
import java.util.Scanner;

public class M5E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantas palabras quieres introducir? ");
        int numDePalabras = sc.nextInt();
        sc.nextLine();

        ArrayList<String> palabras = new ArrayList<>();

        for (int i = 1; i <= numDePalabras; i++) {
            System.out.println("Introduce la palabra " + i + ": ");
            String palabra = sc.nextLine();
            palabras.add(palabra);
        }

        System.out.println("Las palabras introducidas son: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        sc.close();
    }
}
