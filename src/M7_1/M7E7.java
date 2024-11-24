package M7_1;

import java.util.Scanner;

public class M7E7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un caracter");
        String carachter = sc.nextLine();

        System.out.println("Escribe cauntas veces quieres que se repita");
        int num2 = sc.nextInt();

        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(carachter + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

