package M8;

public class Ordenador {
    private String marca;
    private String modelo;
    private String procesador;
    private int memoriaRAM;
    private int capacidadDiscoDuro;

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, String modelo, String procesador, int memoriaRAM, int capacidadDiscoDuro) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return this.procesador;
    }

    public int getMemoriaRAM() {
        return this.memoriaRAM;
    }

    public int getCapacidadDiscoDuro() {
        return this.capacidadDiscoDuro;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }


    public String ejecutarPrograma(String programa) {
        return "Ejecutando... " + programa;
    }

    //    @Override
    public String toString() {
        return "ORDENADOR: " + "\nMarca = " + marca + '\n' + "Modelo = " + modelo + '\n' + "Procesador = " + procesador + '\n' + "Memoria RAM = " + memoriaRAM + " GB" + "\n" + "Capacidad disco duro = " + capacidadDiscoDuro + " GB";
    }
}



