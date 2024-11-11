package M7;

import java.util.Scanner;

public class M7E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduzca una nota: ");
            float nota1 = sc.nextFloat();

            System.out.print("Introduzca otra nota: ");
            float nota2 = sc.nextFloat();

            System.out.print("Introduzca otra nota: ");
            float nota3 = sc.nextFloat();

            float promedio = (nota1 + nota2 + nota3) / 3;
            float resultado = Math.round(promedio * 100) / 100f;

            if (promedio >= 5 && promedio <= 7) {
                System.out.println("¡Enhorabuena! Has aprobado, pero deberías seguir practicando! Tu nota final es: " + resultado);
            } else if (promedio > 7) {
                System.out.println("¡Enhorabuena! ¡Has superado el curso! ¡Pasa ya al siguiente nivel! Tu nota final es: " + resultado);
            } else {
                System.out.println("¡Lo siento! Has suspendido. ¡No te preocupes! ¡Sigue practicando! Tu nota final es: " + resultado);
            }
            System.out.println("desea continuar? (s/n)");
            sc.nextLine();
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("s"));
        sc.close();
    }
}
