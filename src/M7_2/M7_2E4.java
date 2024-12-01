package M7_2;

import java.util.Scanner;

public class M7_2E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero que sara la catidade de * a imprimir: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = num -1 ; i > 0; i--){
            for(int j = 1; j <= i; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
