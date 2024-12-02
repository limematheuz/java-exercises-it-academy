package M8_2;

import javax.swing.*;
import java.util.ArrayList;

public class Hotel {
    private String name;
    private int rooms;
    private int floors;
    private float area;


    public Hotel(String name, int rooms, int floors, float area) {
        this.name = name;
        this.rooms = rooms;
        this.floors = floors;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("| %-25s | %-10d | %-10d | %-12.2f |", name, rooms, floors, area);
    }

    public static String getHotels(ArrayList<Hotel> hotels) {
        StringBuilder hotelsList = new StringBuilder();

        hotelsList.append(String.format("| %-25s | %-10s | %-10s | %-12s |\n", "Name", "Rooms", "Floors", "Area"));
        hotelsList.append("|---------------------------|------------|------------|--------------|\n");


        for (Hotel hotel : hotels) {
            hotelsList.append(hotel.toString()).append("\n");
        }

        return hotelsList.toString(); // Devuelve la lista de hoteles en formato de tabla
    }

    public static String getHotelByName(ArrayList<Hotel> hotels, String name) {
        for (Hotel hotel : hotels) {
            if (hotel.name.equalsIgnoreCase(name)) {
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

        hotel.name = name;
        hotel.rooms = rooms;
        hotel.floors = floors;
        hotel.area = area;

        return hotel;
    }

    public static Hotel deleteHotel(ArrayList<Hotel> hotels, String name) {
        for (Hotel hotel : hotels) {
            if (Hotel.existHotel(hotels, name) != null) {
                hotels.remove(hotel);
                return hotel;
            }
        }
        return null;
    }

    public static Hotel existHotel(ArrayList<Hotel> hotels, String name) {
        for (Hotel hotel : hotels) {
            if (hotel.name.equalsIgnoreCase(name)) {
                return hotel;
            }
        }
        return null;
    }

}
