package M8_3;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cliente" +
                "\nnombre: " + nombre +
                "\napellido: " + apellido +
                "cuentas: " + cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public static void seeClientsList(ArrayList<Cliente> listaClientes) {
        if (listaClientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clientes");
        }

        StringBuilder clientesInfo = new StringBuilder("Lista de clientes: \n");

        for (Cliente cliente : listaClientes) {
            clientesInfo.append("Nombre: ").append(cliente.getNombre()).append(" ").append(cliente.getApellido()).append(" | Numero de cuentas: ").append(cliente.getCuentas().size()).append("\n");
        }
        JOptionPane.showMessageDialog(null, clientesInfo);
    }

    public void añadirCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }

    public static void removeClient(ArrayList<Cliente> listaClientes){
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del cliente/a: ");
        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        if(clienteEncontrado != null){
            listaClientes.remove(clienteEncontrado);
            JOptionPane.showMessageDialog(null, "Cliente/a eliminado/a: " + clienteEncontrado.getNombre() + " " + clienteEncontrado.getApellido());
        }
        else {
            JOptionPane.showMessageDialog(null, "Cliente/a no encontrado/a");
        }

    }
}
