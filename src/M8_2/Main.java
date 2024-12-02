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
                    hotelsList = Hotel.getHotels(hotels);
                    JOptionPane.showMessageDialog(null, "Ver todos los hoteles" + hotelsList);
                    break;
                case 2:
                    hotelName = Hotel.getHotelByName(hotels, JOptionPane.showInputDialog(null, "Indica el nombre del hotel que quieres ver: "));
                    JOptionPane.showMessageDialog(null, "Hotel: \n" + hotelName);
                    break;
                case 3:
                    Hotel.createHotel(hotels);
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
                        Hotel updateHotel = Hotel.updateHotel(hotelToUpdate);
                        JOptionPane.showMessageDialog(null, "HOTEL ACTUALIZADO EXITOSAMENTE!\n" + updateHotel);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ha encontrado el hotel con el nombre: " + hotelName);
                    }
                    break;
                case 5:
                    hotelnameDelete = JOptionPane.showInputDialog(null, "Indica el nombre del hotel que quieres dar de baja:");
                    Hotel hotelToDelete = Hotel.deleteHotel(hotels, hotelnameDelete);

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

}

