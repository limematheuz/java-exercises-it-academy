package M8_2;

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

    public int getRooms() {
        return rooms;
    }

    public int getFloors() {
        return floors;
    }

    public float getArea() {
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String manteinanceCost() {
        int totalPersons =  (int) Math.ceil((float) this.rooms /20);
        int totalCost =  totalPersons * 1500;
        return "The manteinance cost is: " + totalCost + "€";
    }


    @Override
    public String toString() {
        return  "\nName: " + name +
                "\nRooms: " + rooms +
                "\nFloors: " + floors +
                "\nArea: " + area + " m2";
    }
}
