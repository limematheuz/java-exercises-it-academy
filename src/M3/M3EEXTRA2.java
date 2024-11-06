package M3;

import java.util.Scanner;

public class M3EEXTRA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero entero: ");
        int num = sc.nextInt();

        int varInt = (num < 10) ?  num : 1;

        System.out.println("El valor de varInt es: " + varInt);

        for (int i = 1; i<=10; i++){
            System.out.println(varInt + "x" + i + " = " + (varInt * i));
        }
    }
}
