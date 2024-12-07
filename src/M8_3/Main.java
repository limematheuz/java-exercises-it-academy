package M8_3;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void main(String[] args) {
        String[] options = {"Ver clientes", "Crear cliente/a", "Crear cuenta de un cliente/a", "Ingresar euros en una cuenta de un cliente/a", "Eliminar cliente/a", "Retirar euros en una cuenta de un cliente/a", "Salir del programa"};
        String selectedOption;

        listaClientes.add(new Cliente("Pepe", "Perez"));
        listaClientes.add(new Cliente("Juan", "Garcia"));
        listaClientes.add(new Cliente("Maria", "Lopez"));
        listaClientes.add(new Cliente("Ana", "Gonzalez"));

        do {
            selectedOption = (String) JOptionPane.showInputDialog(null, "Selecciona una opcion: ", "Menu de gestion de cuentas", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (selectedOption == null) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa");
                break;
            }

            switch (selectedOption) {
                case "Ver clientes":
                    getAllClient();
                    break;

                case "Crear cliente/a":
                    createClient();
                    break;

                case "Crear cuenta de un cliente/a":
                    createAccount();
                    break;

                case "Ingresar euros en una cuenta de un cliente/a":
                    addMoney();
                    break;

                case "Eliminar cliente/a":
                    removeClient();
                    break;

                case "Retirar euros en una cuenta de un cliente/a":
                    withdrawMoney();
                    break;

                case "Salir del programa":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;

            }
        } while (!selectedOption.equals("Salir del programa"));
    }

    public static void getAllClient() {
        Cliente.getAllClients(listaClientes);
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
                break;
            }
        }

        if (clienteEncontrado != null) {
            Cuenta nuevaCuenta = new Cuenta(numCuenta);
            clienteEncontrado.añadirCuenta(nuevaCuenta);
            JOptionPane.showMessageDialog(null, "Cuenta de cliente/a: " + clienteEncontrado.getNombre() + " \ncon la cuenta: " + numCuenta + " \ncreada con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente/a no encontrado/a");
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

    public static void removeClient() {
        Cliente.removeClient(listaClientes);
    }

    public static void withdrawMoney() {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente/a: ");
        int numCuenta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de cuenta: "));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad a retirar: "));

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

        if (cantidad > cuentaEncontrada.getSaldo()) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes.\nSaldo disponible: " + cuentaEncontrada.getSaldo() + " €");
            return;
        }

        cuentaEncontrada.retirar(cantidad);
        JOptionPane.showMessageDialog(null, "Retiro de " + cantidad + " € realizado con éxito!" +
                "\nEn la cuenta: " + numCuenta +
                "\nSaldo disponible: " + cuentaEncontrada.getSaldo());

    }
}