package M4;

import java.util.Scanner;

public class M4E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Introduzca el día de nacimiento (1-31): ");
            int day = sc.nextInt();

            System.out.print("Introduzca el mes de nacimiento (1-12): ");
            int month = sc.nextInt();

            String zodiac = "";

            if (day < 1 || day > 31 || month < 1 || month > 12) {
                System.out.println("Día o mes fuera de rango. Inténtelo de nuevo.");
            } else {
                switch (month) {
                    case 1:
                        if (day >= 1 && day <= 19) {
                            zodiac = "Capricornio";
                        } else if (day >= 20 && day <= 31) {
                            zodiac = "Acuario";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 2:
                        if (day >= 1 && day <= 18) {
                            zodiac = "Acuario";
                        } else if (day >= 19 && day <= 29) {
                            zodiac = "Piscis";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 3:
                        if (day >= 1 && day <= 20) {
                            zodiac = "Piscis";
                        } else if (day >= 21 && day <= 31) {
                            zodiac = "Aries";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 4:
                        if (day >= 1 && day <= 19) {
                            zodiac = "Aries";
                        } else if (day >= 20 && day <= 30) {
                            zodiac = "Tauro";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 5:
                        if (day >= 1 && day <= 20) {
                            zodiac = "Tauro";
                        } else if (day >= 21 && day <= 31) {
                            zodiac = "Geminis";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 6:
                        if (day >= 1 && day <= 20) {
                            zodiac = "Geminis";
                        } else if (day >= 21 && day <= 30) {
                            zodiac = "Cancer";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 7:
                        if (day >= 1 && day <= 22) {
                            zodiac = "Cancer";
                        } else if (day >= 23 && day <= 31) {
                            zodiac = "Leo";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 8:
                        if (day >= 1 && day <= 22) {
                            zodiac = "Leo";
                        } else if (day >= 23 && day <= 31) {
                            zodiac = "Virgo";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 9:
                        if (day >= 1 && day <= 22) {
                            zodiac = "Virgo";
                        } else if (day >= 23 && day <= 30) {
                            zodiac = "Libra";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 10:
                        if (day >= 1 && day <= 22) {
                            zodiac = "Libra";
                        } else if (day >= 23 && day <= 31) {
                            zodiac = "Escorpio";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 11:
                        if (day >= 1 && day <= 21) {
                            zodiac = "Escorpio";
                        } else if (day >= 22 && day <= 30) {
                            zodiac = "Sagitario";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                        break;
                    case 12:
                        if (day >= 1 && day <= 21) {
                            zodiac = "Sagitario";
                        } else if (day >= 22 && day <= 31) {
                            zodiac = "Capricornio";
                        } else {
                            zodiac = "Fecha invalida";
                        }
                    default:
                        zodiac = "Mes invalido";
                        break;
                }
                System.out.println("Tu signo zodiacal es: " + zodiac);
            }
            System.out.println("\nQuieres continuar? (S/N): ");
            sc.nextLine();
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        sc.close();
    }
}

