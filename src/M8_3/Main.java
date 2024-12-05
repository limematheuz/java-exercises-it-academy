package M8_3;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();


    public static void main(String[] args) {

        ArrayList<Cuenta> listaCuentas = new ArrayList<>();


        String[] options = {"Crear cliente/a", "Crear cuenta de un cliente/a", " Ingresar euros en una cuenta de un cliente/a", "Eliminar cliente/a", "Retirar euros en una cuenta de un cliente/a", "Salir del programa"};

        String selectedOption;

        do {
            selectedOption = (String) JOptionPane.showInputDialog(null, "Selecciona una opcion: ", "Menu de gestion de cuentas", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


            if (selectedOption == null) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa");
                break;
            }

            switch (selectedOption) {
                case "Crear cliente/a":
                    createClient();
                    break;

                case "Crear cuenta de un cliente/a":
                    createAccount();
                    break;

                case "Ingresar euros en una cuenta de un cliente/a":
                    addMoney();
                    break;
            }
        } while (!selectedOption.equals("Salir del programa"));
    }

    public static void createClient() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente/a: ");
        String apellido = JOptionPane.showInputDialog("Introduce el apellido del cliente/a: ");
        Cliente cliente = new Cliente(nombre, apellido);
        listaClientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Cliente/a creado/a: " + cliente.getNombre() + " " + cliente.getApellido());
    }

    public static void createAccount() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente/a: ");
        int numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de cuenta: "));

        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                clienteEncontrado = cliente;
            }

            if (clienteEncontrado != null) {
                Cuenta nuevaCuenta = new Cuenta(numCuenta);
                clienteEncontrado.añadirCuenta(nuevaCuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de cliente/a: " + clienteEncontrado.getNombre() + " \ncon la cuenta: " + numCuenta + " \ncreada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente/a  no encontrado/a");
            }
        }
    }

    public static void addMoney() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente/a: ");
        int numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de cuenta: "));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a ingresar: "));

        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "Cliente/a no encontrado/a");
            return;
        }

        // Buscar la cuenta del cliente por número
        Cuenta cuentaEncontrada = null;
        for (Cuenta cuenta : clienteEncontrado.getCuentas()) {
            if (cuenta.getNumCuenta() == numCuenta) {
                cuentaEncontrada = cuenta;
                break;
            }
        }

        if (cuentaEncontrada == null) {
            JOptionPane.showMessageDialog(null, "Cuenta no encontrada");
            return;
        }

        cuentaEncontrada.ingresar(cantidad);
        JOptionPane.showMessageDialog(null, "Ingreso de " + cantidad + " € realizado con éxito!" +
                "\nEn la cuenta: " + numCuenta +
                "\nSaldo disponible: " + cuentaEncontrada.getSaldo());
    }
}



