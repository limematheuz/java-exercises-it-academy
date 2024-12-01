package M7_2;

import java.util.Scanner;

public class M7_2E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero que sara la catidade de * a imprimir: ");
        int num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
