package M6;

import java.util.Scanner;

public class M6E1 {

    private static final Scanner sc = new Scanner(System.in);

    public static float sumar(float a, float b) {
        return a + b;
    }

    public static void restar(float a, float b) {
        float result;
        result = a - b;
        System.out.println("El resultado de la resta es: " + result);
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }

    public static float dividir(float a, float b) {
        if (b == 0) {
            System.out.println("No se puede dividir por 0");
            return 0;
        } else {
            return a / b;
        }
    }

    public static float modulo(float a, float b) {
        return a % b;
    }

    public static void main(String[] args) {
        float a;
        float b;
        String operador;
        float resultado;
        String continuar;

        do {
            System.out.print("\nIngrese el primer número: ");
            a = sc.nextFloat();
            System.out.print("Ingrese el segundo número: ");
            b = sc.nextFloat();
            System.out.print("Escribe un operador ( +, -, *, /, % ): ");
            operador = sc.next();

            switch (operador) {
                case "+":
                    resultado = sumar(a, b);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case "-":
                    restar(a, b);
                    break;
                case "*":
                    resultado = multiplicar(a, b);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case "/":
                    while (b == 0) {
                        System.out.println("No se puede dividir por 0, ingrese otro número: ");
                        b = sc.nextFloat();
                    }
                    resultado = dividir(a, b);
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                case "%":
                    resultado = modulo(a, b);
                    System.out.println("El resultado del módulo es: " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido");
            }

            System.out.println("\n¿Quieres realizar otra operación? (S/N): ");
            continuar = sc.next().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("¡Gracias por usar la calculadora! Hasta la próxima.");
        sc.close();
    }
}

