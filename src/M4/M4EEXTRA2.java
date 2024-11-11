package M4;

import java.util.Scanner;

public class M4EEXTRA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        System.out.println("Escribe un numero dentro del rango de 1 a 99");
        int num = sc.nextInt();

        int decenas = num / 10;
        int unidades = num % 10;

        if (num < 0 || num > 99) {
            throw new Error("El número debe estar entre 1 y 99");
        } else {
            String resultado = "";
            String unidadStr = "";
            String specialStr = "";
            String decenasStr = "";

            if (num <= 9) {
                switch (num) {
                    case 0:
                        unidadStr = "cero";
                        break;
                    case 1:
                        unidadStr = "uno";
                        break;
                    case 2:
                        unidadStr = "dos";
                        break;
                    case 3:
                        unidadStr = "tres";
                        break;
                    case 4:
                        unidadStr = "cuatro";
                        break;
                    case 5:
                        unidadStr = "cinco";
                        break;
                    case 6:
                        unidadStr = "seis";
                        break;
                    case 7:
                        unidadStr = "siete";
                        break;
                    case 8:
                        unidadStr = "ocho";
                        break;
                    case 9:
                        unidadStr = "nueve";
                        break;
                }
            } else if (num >= 10 && num <= 19) {
                switch (num) {
                    case 10:
                        specialStr = "diez";
                        break;
                    case 11:
                        specialStr = "once";
                        break;
                    case 12:
                        specialStr = "doce";
                        break;
                    case 13:
                        specialStr = "trece";
                        break;
                    case 14:
                        specialStr = "catorce";
                        break;
                    case 15:
                        specialStr = "quince";
                        break;
                    case 16:
                        specialStr = "dieciseis";
                        break;
                    case 17:
                        specialStr = "diecisiete";
                        break;
                    case 18:
                        specialStr = "dieciocho";
                        break;
                    case 19:
                        specialStr = "diecinueve";
                        break;
                }
            } else if (num >= 20 && num < 100) {
                switch (decenas) {
                    case 2:
                        decenasStr = "veinte";
                        break;
                    case 3:
                        decenasStr = "treinta";
                        break;
                    case 4:
                        decenasStr = "cuarenta";
                        break;
                    case 5:
                        decenasStr = "cincuenta";
                        break;
                    case 6:
                        decenasStr = "sesenta";
                        break;
                    case 7:
                        decenasStr = "setenta";
                        break;
                    case 8:
                        decenasStr = "ochenta";
                        break;
                    case 9:
                        decenasStr = "noventa";
                        break;
                }
                System.out.println("El número " + num + " en letras es: " + resultado);
            }
            sc.close();
        }
    }
}






