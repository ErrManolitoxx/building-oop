package components;

import model.Building;

import java.util.Scanner;

public class BuildingReader {

    private final Scanner scanner;

    public BuildingReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Building read() {
        System.out.println("Introduzca la dirección del edificio: ");
        String address = scanner.nextLine();

        System.out.println("Introduzca el municipio donde se encuentra el edificio: ");
        String town = scanner.nextLine();

        System.out.println("¿Con cuantos apartamentos consta el edificio?");
        int apartments = scanner.nextInt();
        scanner.nextLine();
        return new Building(address, town, apartments);
    }
}
