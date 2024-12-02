package M8_2;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Hotel> hotels = new ArrayList<>();

        int option;
        String hotelsList;
        String hotelName;
        String hotelnameDelete;
        String hotelMaintenanceCost;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    " 1. Ver hoteles\n" +
                            " 2. Ver un hotel\n" +
                            " 3. Dar de alta un hotel\n" +
                            " 4. Modificar un hotel \n" +
                            " 5. Dar de baja un hotel\n" +
                            " 0. Salir del programa", "Menu de gestion de hoteles", JOptionPane.QUESTION_MESSAGE));

            switch (option) {
                case 1:
                    if (hotels.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay hoteles registrados");
                    } else {
                        StringBuilder maintenanceCost = new StringBuilder("Costo de mantenimiento de los hoteles: \n ");
                        for (Hotel hotel : hotels) {
                            maintenanceCost.append(hotel.getName()).append(": ").append(hotel.manteinanceCost()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, maintenanceCost.toString());
                    }
                    break;
                case 2:
                    hotelName = getHotelByName(hotels, JOptionPane.showInputDialog(null, "Indica el nombre del hotel que quieres ver: "));
                    if (hotelName != null) {
                        JOptionPane.showMessageDialog(null, "Hotel: \n" + hotelName);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha encontrado el hotel con el nombre: " + hotelName);
                    }
                    break;
                case 3:
                    createHotel(hotels);
                    break;
                case 4:
                    hotelName = JOptionPane.showInputDialog(null, "Indica el nombre del hotel que quieres modificar:");
                    Hotel hotelToUpdate = null;

                    for (Hotel h : hotels) {
                        if (h.getName().equalsIgnoreCase(hotelName)) {
                            hotelToUpdate = h;
                            break;
                        }
                    }

                    if (hotelToUpdate != null) {
                        Hotel updateHotel = updateHotel(hotelToUpdate);
                        JOptionPane.showMessageDialog(null, "HOTEL ACTUALIZADO EXITOSAMENTE!\n" + updateHotel);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha encontrado el hotel con el nombre: " + hotelName);
                    }
                    break;
                case 5:
                    hotelnameDelete = JOptionPane.showInputDialog(null, "Indica el nombre del hotel que quieres dar de baja:");
                    Hotel hotelToDelete = deleteHotel(hotels, hotelnameDelete);

                    if (hotelToDelete != null) {
                        JOptionPane.showMessageDialog(null, "HOTEL ELIMINADO CORRECTAMENTE!\n" + hotelToDelete);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha encontrado el hotel con el nombre: " + hotelnameDelete);
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (option != 0);

    }

    public static String getHotels(ArrayList<Hotel> hotels) {
        if (hotels.isEmpty()) {
            return "No hay hoteles registrados.";
        }

        StringBuilder hotelsList = new StringBuilder("Lista de hoteles: \n");
        for (Hotel hotel : hotels) {
            hotelsList.append(hotel.toString()).append("\n");
        }

        return hotelsList.toString(); // Devuelve la lista de hoteles en forma de cadena
    }

    public static String getHotelByName(ArrayList<Hotel> hotels, String name) {
        for (Hotel hotel : hotels) {
            if (hotel.getName().equalsIgnoreCase(name)) {
                return hotel.toString();
            }
        }
        return "No se ha encontrado el hotel con el nombre: " + name;
    }

    public static void createHotel(ArrayList<Hotel> hotels) {

        String name = JOptionPane.showInputDialog(null, "Introduce el nombre del hotel: ");

        if (existHotel(hotels, name) != null) {
            JOptionPane.showMessageDialog(null, "El hotel con el nombre: " + name + " ya existe!");
            return;
        }

        int rooms = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de habitaciones: "));
        int floors = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de plantas: "));
        float area = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la superficie del hotel: "));

        Hotel newHotel = new Hotel(name, rooms, floors, area);
        hotels.add(newHotel);

        JOptionPane.showMessageDialog(null, "HOTEL CREADO EXITOSAMENTE!\n" + newHotel);
    }

    public static Hotel updateHotel(Hotel hotel) {
        String name = JOptionPane.showInputDialog(null, "Introduce el nuevo nombre del hotel: ");
        int rooms = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el nuevo número de habitaciones: "));
        int floors = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el nuevo número de plantas: "));
        float area = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce la nueva superficie del hotel: "));

        hotel.setName(name);
        hotel.setRooms(rooms);
        hotel.setFloors(floors);
        hotel.setArea(area);

        return hotel;
    }

    public static Hotel deleteHotel(ArrayList<Hotel> hotels, String name) {
        Hotel hotel = existHotel(hotels, name);
        {
            if (hotel != null) {
                hotels.remove(hotel);
                return hotel;
            }
            return null;
        }
    }

    public static Hotel existHotel(ArrayList<Hotel> hotels, String name) {
        for (Hotel hotel : hotels) {
            if (hotel.getName().equalsIgnoreCase(name)) {
                return hotel;
            }
        }
        return null;
    }

}

