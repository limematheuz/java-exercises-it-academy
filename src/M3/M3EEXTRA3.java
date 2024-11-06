package M3;

import java.util.Scanner;

public class M3EEXTRA3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int coberturaLitro = 12;

        System.out.print("Escribe la altura:");
        double altura = sc.nextDouble();

        System.out.print("Escribe el ancho:");
        double ancho = sc.nextDouble();

        double areaDeLaPared =  (altura*ancho);

        double totalPintura = (areaDeLaPared*coberturaLitro);


    }
}
