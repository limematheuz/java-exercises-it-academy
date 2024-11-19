package M7;

import java.util.ArrayList;
import java.util.Scanner;

public class M7E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        String tarea;

        ArrayList<String> listaTareas = new ArrayList<>();

        do {

            System.out.println("\n1. Añadir tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Listar tareas");
            System.out.println("4. Salir");
            System.out.println("selecciona una opción:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la tarea que quieres añadir");
                    tarea = sc.nextLine();
                    listaTareas.add(tarea);
                    System.out.println("Tarea añadida: " + tarea);
                    break;
                case 2:
                    System.out.println("Introduce la tarea que quieres eliminar");
                    tarea = sc.nextLine();
                    int eliminarTarea = listaTareas.indexOf(tarea);

                    if (eliminarTarea == -1) {
                        System.out.println("Tarea: " + tarea + " no encontrada");
                    } else {
                        listaTareas.remove(eliminarTarea);
                        System.out.println("Tarea eliminada: " + tarea);
                    }

                    listaTareas.remove(tarea);
                    break;
                case 3:
                    System.out.println("Lista de tareas: " + "\n");
                    for (int i = 0; i < listaTareas.size(); i++) {
                        System.out.println((i + 1) + "-- " + listaTareas.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }

}
