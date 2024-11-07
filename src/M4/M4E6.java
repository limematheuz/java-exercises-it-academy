package M4;

import java.util.Scanner;

public class M4E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduzca un dia: (1-31)");
            int day = sc.nextInt();

            System.out.print("Introduzca un mes: (1-12)");
            String month = sc.next();

            System.out.print("Aries, Tauro, Geminis, Cancer, Leo, Virgo, Libra, Escorpio, Sagitario, Capricornio, Acuario, Piscis");
            String zodiac = "";

            String result = "";

            if (day < 1 && day > 31) {
                System.out.print("Introduzca un dia entre: (1-31)");
            }else {
                System.out.print("Introduzca un dia entre: (1-12)");
            }

            switch (zodiac) {
                case "Aries":
//                    (day <= 21 && day >= 19)? "Aries" : "Tauro";
                            result = day + month;

            }

            System.out.println("\nQuieres continuar? (S/N): ");
            sc.nextLine();
            continuar = sc.nextLine();

        } while (continuar.equals("s"));
        sc.close();
    }
}
