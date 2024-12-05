package model;

import java.util.Objects;

public class Apartment {
    private int floor;
    private String door;
    private int owners;

    public Apartment(int floor, String door, int owners) {
        this.floor = floor;
        this.door = door;
        this.owners = owners;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public int getOwners() {
        return owners;
    }

    public void setOwners(int owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return floor == apartment.floor && owners == apartment.owners && Objects.equals(door, apartment.door);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, door, owners);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floor=" + floor +
                ", door='" + door + '\'' +
                ", owners=" + owners +
                '}';
    }
}
