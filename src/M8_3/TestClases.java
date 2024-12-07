package M8_3;

public class TestClases {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matheus", "Ribeiro");
        Cuenta cuenta1 = new Cuenta(12345);
        Cuenta cuenta2 = new Cuenta(67890);

        cliente.añadirCuenta(cuenta1);
        cliente.añadirCuenta(cuenta2);

        cuenta1.ingresar(1000);

//        boolean retirado = cuenta1.retirar(500);
//        boolean retirado2 = cuenta1.retirar(2000);

//        boolean eliminada = cliente.removeClient();

        System.out.println("Saldo cuenta 1: " + cuenta1.getSaldo());
//        System.out.println("Saldo cuenta 2: " + retirado);
//        System.out.println("Cuenta eliminada: " + retirado2);
//        System.out.println("Cuenta eliminada: " + eliminada);

    }
}
