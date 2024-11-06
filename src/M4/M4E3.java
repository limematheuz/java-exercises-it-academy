package M4;

import java.util.Scanner;

public class M4E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Cual es tu edad: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Tienes titulo universitario? (S/N): ");
            String universityDegree = sc.nextLine();

            System.out.println("Estas en el paro? (S/N): ");
            String state = sc.nextLine();

            if (((age >= 18 && age <= 67) && (universityDegree.equalsIgnoreCase("s")) || state.equalsIgnoreCase("s"))) {
                System.out.println("se te asigna una beca, porque eres guay!!! ✌️😎");
            } else if (age < 18) {
                System.out.println("no se te asigna una beca, porque eres menor de edad! haber nacido antes! 🔞");
            } else if (!universityDegree.equalsIgnoreCase("s")) {
                System.out.println("no se te asigna una beca, porque no tienes titulo universitario! Haber estudiao wapo!😘");
            } else {
                System.out.println("no se te asigna una beca");
            }

            System.out.println("\nQuieres ingresar otra respuesta? (S/N): ");
            continuar = sc.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        sc.close();
    }
}
