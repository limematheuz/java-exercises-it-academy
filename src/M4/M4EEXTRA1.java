package M4;

import java.util.Scanner;

public class M4EEXTRA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduzca un dividendo: ");
            int dividendo = sc.nextInt();

            System.out.print("Introduzca un divisor: ");
            int divisor = sc.nextInt();

            float result = 0;

            if (divisor < 2 || divisor > 7) {
                throw new Error("El divisor debe estar entre 2 y 7");
            } else if (dividendo % divisor == 0) {
                result = (float) dividendo / divisor;
                System.out.println("El número " + dividendo + " es múltiplo de " + divisor);
            } else {
                System.out.println("El número " + dividendo + " no es múltiplo de " + divisor);
                result = (float) dividendo / divisor;
            }

            System.out.println("El resultado de la división es: " + result);

            System.out.println("\nQuieres ingresar otra respuesta? (S/N): ");
            sc.nextLine();
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("s"));
        sc.close();
    }
}
