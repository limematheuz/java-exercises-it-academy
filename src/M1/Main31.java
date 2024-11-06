package M1;

import java.util.Scanner;

public class Main31 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cual es tu nombre?");
        String name = scanner.nextLine();

        System.out.print("Cual es tu apellido?");
        String lastName = scanner.nextLine();

        System.out.print("Cual es tu edad?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("cúentame algo sobre ti");
        String aboutYou = scanner.nextLine();

        System.out.print("Cual es tu hobby favorito? ");
        String hobby = scanner.nextLine();

        System.out.print("\nInformacion sobre ti:");
        System.out.println("\nNombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Sobre ti: " + aboutYou);
        System.out.println("Hobby: " + hobby);

        scanner.close();
    }
}
