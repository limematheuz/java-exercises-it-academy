package M4;

//El usuario introduce un mes por pantalla y mediante un switch con los 12 meses del año, el programa calcula los días del mes y muestra lo siguiente:
//
//Ejemplo: Si el número introducido es 1, entonces debe aparecer por pantalla: “El mes de enero tiene 31 días”

import java.util.Scanner;

public class M4E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.println("Introduzca un numero del mes (1-12): ");
            int mes = sc.nextInt();
            sc.nextLine();

            int dias = 0;
            String monthName = "";

            switch (mes) {
                case 1:
                    monthName = "Enero";
                    dias = 31;
                    break;
                case 2:
                    monthName = "Febrero";
                    dias = 28;
                    break;
                case 3:
                    monthName = "Marzo";
                    dias = 31;
                    break;
                case 4:
                    monthName = "Abril";
                    dias = 30;
                    break;
                case 5:
                    monthName = "Mayo";
                    dias = 31;
                    break;
                case 6:
                    monthName = "Junio";
                    dias = 30;
                    break;
                case 7:
                    monthName = "Julio";
                    dias = 31;
                    break;
                case 8:
                    monthName = "Agosto";
                    dias = 31;
                    break;
                case 9:
                    monthName = "Septiembre";
                    dias = 30;
                    break;
                case 10:
                    monthName = "Octubre";
                    dias = 31;
                    break;
                case 11:
                    monthName = "Noviembre";
                    dias = 30;
                    break;
                case 12:
                    monthName = "Diciembre";
                    dias = 31;
                    break;

                default:
                    System.out.println("numero de mes es invalido. Por favor introduce un numero entre 1 y 12");
            }

            if (!monthName.isEmpty()) {
                System.out.println("El mes de " + monthName + " tiene " + dias + " dias");
            }

            System.out.println("\nQuieres ingresar otra respuesta? (S/N): ");
            sc.nextLine();
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        sc.close();
    }
}
