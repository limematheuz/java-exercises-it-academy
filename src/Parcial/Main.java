package Parcial;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> estudiantesInscritos = new ArrayList<>();
        estudiantesInscritos.add("Anna");
        estudiantesInscritos.add("Pau");
        estudiantesInscritos.add("Laura");
        estudiantesInscritos.add("Marc");
        estudiantesInscritos.add("Júlia");
        estudiantesInscritos.add("Aleix");
        estudiantesInscritos.add("Eva");
        estudiantesInscritos.add("Jordi");
        estudiantesInscritos.add("Clàudia");
        estudiantesInscritos.add("David");
        estudiantesInscritos.add("Sara");
        estudiantesInscritos.add("Joan");

        ArrayList<String> estudiantesInteresados = new ArrayList<>();
        estudiantesInteresados.add("Anna");
        estudiantesInteresados.add("Marc");
        estudiantesInteresados.add("Joan");
        estudiantesInteresados.add("Sara");
        estudiantesInteresados.add("eva");
        estudiantesInteresados.add("Carles");
        estudiantesInteresados.add("Marina");
        estudiantesInteresados.add("Pol");
        estudiantesInteresados.add("Berta");
        estudiantesInteresados.add("Javier");
        estudiantesInteresados.add("Laura");
        estudiantesInteresados.add("Hèctor");

        ArrayList<String> proyectoReal = proyectoReal(estudiantesInscritos, estudiantesInteresados);
        JOptionPane.showMessageDialog(null, proyectoReal);
    }

    public static ArrayList<String> proyectoReal(ArrayList<String> estudiantesInscritos, ArrayList<String> estudiantesInteresados) {
        ArrayList<String> proyectoReal = new ArrayList<>();
        for (String estudiante : estudiantesInscritos) {
            if (estudiantesInteresados.contains(estudiante)) {
                proyectoReal.add(estudiante);
            }

        }
        return proyectoReal;
    }
}
