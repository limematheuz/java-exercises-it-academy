package M7;

import java.util.Scanner;

public class M7E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Escribe un numero: ");
            int num = sc.nextInt();
            sc.nextLine();

            System.out.println("Escribe otro numero: ");
            int num2 = sc.nextInt();
            sc.nextLine();

            if ((num < 0 && num2 > 0) || (num > 0 && num2 < 0)) {
                System.out.println("Uno de los numeros es negativo");
            } else {
                System.out.println("Ambos números son positivos o ambos son negativos");
            }
            System.out.println("¿Quieres continuar? (s/n)");
            sc.nextLine();
            continuar = sc.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        sc.close();
    }
}
