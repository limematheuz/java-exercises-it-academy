package M8_3;

public class Cuenta {
    private int saldo;
    private int numCuenta;

    public Cuenta(int numCuenta){
        this.saldo = 0;
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta" +
                "\nsaldo: " + saldo +
                "\nnumCuenta: " + numCuenta;
    }

    public int getSaldo(){
        return saldo;
    }

    public int getNumCuenta(){
        return numCuenta;
    }

    public void ingresar(int cantidad){
        if(cantidad > 0){
            this.saldo += cantidad;
        }
    }

    public void retirar(int cantidad){
        if(cantidad > 0  && cantidad <= this.saldo){
            this.saldo -= cantidad;

        }
    }
}
