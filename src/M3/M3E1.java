package M3;

import java.util.Scanner;

public class M3E1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Por favor, introduce tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Por favor, introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18){
        System.out.println(nombre + " " + apellido + ", eres mayor de edad");
        }else {
        System.out.println( nombre + " " + apellido + ", eres menor de edad");
        }

        System.out.println(nombre + " " + apellido + ", eres " + (edad >= 18 ? "mayor " : "menor ") + "de edad" );

        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);

        scanner.close();
    }
}
