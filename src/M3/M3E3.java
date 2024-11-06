package M3;

import java.util.Scanner;

public class M3E3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una nota:");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese una nota:");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese una nota:");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println(" la media de las notas es:" + media);
    }
}
