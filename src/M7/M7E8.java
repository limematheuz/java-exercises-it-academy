package M7;

import java.util.Scanner;

public class M7E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Introduce la temperatura en grados centígrados: ");
            int temperature = sc.nextInt();

            int K = 32;
            float result = (temperature * 9.0f / 5) + K;

            System.out.println("La conversion a Fahrenheit es: " + result + " °F");

            System.out.println("Quieres continuar? (s/n): ");
            sc.nextLine();
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        sc.close();
    }
}
