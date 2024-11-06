package M4;

import java.util.Scanner;

public class M4E2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continuar;


        do {
            System.out.println("Dime tu edad: ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age <= 0) {
                System.out.println("El edad debe ser mayor que 0");
            }else if(age <= 5) {
                System.out.println("prescolar");
            } else if (age <= 11) {
                System.out.println("primaria");
            } else if (age <= 15) {
                System.out.println("ESO");
            } else if (age <= 17) {
                System.out.println("Bachillrato");
            } else {
                System.out.println("eres mayor de edad: FP o Universidad");
            }

            System.out.println("Quieres ingresar otra edad? (S/N): ");
            continuar = sc.nextLine().toLowerCase();
        } while (continuar.equals("s"));

        sc.close();
    }


}

