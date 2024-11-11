package M4;

import java.util.Scanner;

public class M4EEXTRA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        System.out.println("Escribe un numero dentro del rango de 1 a 99");
        int num = sc.nextInt();

        if (num < 0 || num > 99) {
            throw new Error("El número debe estar entre 1 y 99");
        } else {
            int decenas = num / 10;
            int unidades = num % 10;

            String resultado = "";

            if (num <= 9) {
                switch (num) {
                    case 0:
                        resultado = "cero";
                        break;
                    case 1:
                        resultado = "uno";
                        break;
                    case 2:
                        resultado = "dos";
                        break;
                    case 3:
                        resultado = "tres";
                        break;
                    case 4:
                        resultado = "cuatro";
                        break;
                    case 5:
                        resultado = "cinco";
                        break;
                    case 6:
                        resultado = "seis";
                        break;
                    case 7:
                        resultado = "siete";
                        break;
                    case 8:
                        resultado = "ocho";
                        break;
                    case 9:
                        resultado = "nueve";
                        break;
                }
            } else if (num >= 10 && num <= 19) {
                switch (num) {
                    case 10:
                        resultado = "diez";
                        break;
                    case 11:
                        resultado = "once";
                        break;
                    case 12:
                        resultado = "doce";
                        break;
                    case 13:
                        resultado = "trece";
                        break;
                    case 14:
                        resultado = "catorce";
                        break;
                    case 15:
                        resultado = "quince";
                        break;
                    case 16:
                        resultado = "dieciseis";
                        break;
                    case 17:
                        resultado = "diecisiete";
                        break;
                    case 18:
                        resultado = "dieciocho";
                        break;
                    case 19:
                        resultado = "diecinueve";
                        break;
                }
            } else if (num >= 20 && num < 100) {
                String decenasStr = "";

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

                if (unidades != 0) {
                    String unidadesStr = "";
                    switch (unidades) {
                        case 1:
                            unidadesStr = "uno";
                            break;
                        case 2:
                            unidadesStr = "dos";
                            break;
                        case 3:
                            unidadesStr = "tres";
                            break;
                        case 4:
                            unidadesStr = "cuatro";
                            break;
                        case 5:
                            unidadesStr = "cinco";
                            break;
                        case 6:
                            unidadesStr = "seis";
                            break;
                        case 7:
                            unidadesStr = "siete";
                            break;
                        case 8:
                            unidadesStr = "ocho";
                            break;
                        case 9:
                            unidadesStr = "nueve";
                            break;
                    }

                    resultado = decenasStr + " y " + unidadesStr;
                } else {
                    resultado = decenasStr;
                }
            }
            System.out.println("El número " + num + " en letras es: " + resultado);
        }
        sc.close();
    }
}







