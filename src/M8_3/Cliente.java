package M8_3;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Cuenta> cuentas;

    public Cliente(String nombre, String apellido){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public ArrayList<Cuenta> getCuentas(){
        return cuentas;
    }

    public void añadirCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }

    public boolean eliminarCuenta(int numCuenta){
        boolean cuentaEliminada = false;
        for (Cuenta cuenta : cuentas){
            if( cuenta.getNumCuenta() == numCuenta){
                cuentas.remove(cuenta);
                cuentaEliminada = true;
            }

        }
        return cuentaEliminada;
    }
}
