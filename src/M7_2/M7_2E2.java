package M7_2;

import java.util.Scanner;

public class M7_2E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero que sara la catidade de * a imprimir: ");
        int num = sc.nextInt();

        String asteriscos = "";

        for (int i = 1; i <= num; i++) {
            asteriscos += "*";
            System.out.println(asteriscos);
        }
    }

}


