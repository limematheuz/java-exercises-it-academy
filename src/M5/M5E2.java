package M5;

import java.util.Scanner;

public class M5E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entra un numero: ");
        int number = input.nextInt();

        System.out.println("Entra otro número: ");
        int number2 = input.nextInt();

        int suma = 0;
//        StringBuilder resultado = new StringBuilder();
        String resultado = "";

        for (int i = number; i <= number2; i++) {
            suma += i; // Suma el numero actual i a la variable suma
            resultado += i;
//            resultado.append(i);

            if (i < number2) {
                resultado += " + ";
            }
        }

        resultado += (" = ") + (suma);

//        resultado.append(" = ").append(suma);

        System.out.println("La suma de los números entre " + number + " y " + number2 + " es: " + resultado);
        input.close();
    }

}
