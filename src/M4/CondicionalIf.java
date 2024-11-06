package M4;

import java.util.Scanner;

public class CondicionalIf {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int edad = 0;
            String sexo = "";
            int numeroHijos = 0;

            System.out.println("Dime tu edad: ");
            edad = entrada.nextInt();
            entrada.nextLine();   // Limpiar el buffer

    /* Com a regla general s'ha de netejar el buffer d'entrada de Scanner
       quan hem d'introduir una dada de tipus String després d'haver introduït
       una dada de tipus numèric */

            System.out.println("Dime tu género: F/M");
            sexo= entrada.nextLine();

            System.out.println("Número de hijos: ");
            numeroHijos = entrada.nextInt();

            if ((edad < 11 && sexo.equalsIgnoreCase("F")) || (edad < 13 && sexo.equalsIgnoreCase("M"))) {
                System.out.println("Con tu edad no puedes ser padre o madre");
            } else {
                if (sexo.equalsIgnoreCase("F") && numeroHijos > 0) {
                    System.out.println("Eres madre");
                } else if (sexo.equalsIgnoreCase("M") && numeroHijos > 0) {
                    System.out.println("Eres padre");
                } else {
                    System.out.println("Eres libre");
                }
            }
        }
    }

