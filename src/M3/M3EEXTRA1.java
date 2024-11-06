package M3;

import java.util.Scanner;

public class M3EEXTRA1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero:");
        int num1 = sc.nextInt();

        int doble= num1 * 2;
        int triple= num1 * 3;

        //o

        System.out.println("el doble de la operacion es:" + (num1 * 2));
        System.out.println("el triple de la operacion es:" + (num1 * 3));

        //o

        System.out.println("el doble de la operacion es:" + (doble));
        System.out.println("el triple de la operacion es:" + (triple));
    }
}
