package M4;

import java.util.Scanner;

public class M4EEXTRA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugamos a piedra, papel o tijera:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("Introduce un número entre 1 y 3: ");
        int userNum = sc.nextInt();

        if (userNum < 1 || userNum > 3) {
            System.out.println("Entiendo que no quieres jugar. Adiós");
        } else {

            switch (userNum) {
                case 1:
                    System.out.println("✊");
                    break;
                case 2:
                    System.out.println("✋");
                    break;
                case 3:
                    System.out.println("✌️");
                    break;
                default:
                    System.out.println("Error");
            }
        }

        int numRandom = (int) (Math.random() * 3) + 1;
        switch (numRandom) {
            case 1:
                System.out.println("✊");
                break;
            case 2:
                System.out.println("✋");
                break;
            case 3:
                System.out.println("✌️");
                break;
            default:
                System.out.println("Error");
        }

        System.out.println("Yo elijo: " + numRandom + "\ny tú eliges: " + userNum);

        if (userNum == numRandom) {
            System.out.println("Empate!");
        } else if (userNum == 1 && numRandom == 3) {
            System.out.println("Eres el ganador! ");
        } else if (userNum == 2 && numRandom == 1) {
            System.out.println("Eres el ganador! ");
        } else if (userNum == 3 && numRandom == 2) {
            System.out.println("Eres el ganador! ");
        } else {
            System.out.println("Has perdido! ");
        }
    }
}
