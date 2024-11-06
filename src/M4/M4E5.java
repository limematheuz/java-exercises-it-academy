package M4;

import java.util.Scanner;

public class M4E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Escribe um numero: ");
            double num = sc.nextDouble();
            sc.nextLine();

            System.out.print("Escribe un operador ( +, -, *, /, % ): ");
            String operador = sc.nextLine();

            System.out.print("Escribe um numero: ");
            double num2 = sc.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (operador) {
                case "+":
                    result = num + num2;
                    break;
                case "-":
                    result = num - num2;
                    break;
                case "*":
                    result = num * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num / num2;
                    } else {
                        System.out.println("Error: no puede dividirse por 0");
                        validOperation = false;
                    }
                    break;
                case "%":
                    result = num % num2;
                    break;

                default:
                    System.out.println("operador invalido!");
                    validOperation = false;
                    break;
            }

            if (validOperation) {
                System.out.println(num + " " + operador + " " + num2 + " = " + result);
            }

            System.out.println("\nQuieres ingresar otra respuesta? (S/N): ");
            sc.nextLine();
            continuar = sc.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        sc.close();
    }
}
