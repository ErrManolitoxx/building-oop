package model;

import java.util.Objects;

public class Building {
    private String address;
    private String town;
    private int apartments;

    public Building(String address, String town, int apartments) {
        this.address = address;
        this.town = town;
        this.apartments = apartments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return apartments == building.apartments && Objects.equals(address, building.address) && Objects.equals(town, building.town);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, town, apartments);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", town='" + town + '\'' +
                ", apartments=" + apartments +
                '}';
    }
}
