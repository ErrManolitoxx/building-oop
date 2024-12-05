package components;

import model.Apartment;

import java.util.Scanner;

public class ApartmentReader {

    private final Scanner scanner;

    public ApartmentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Apartment read() {
        System.out.println("Introduzca la planta donde se encuentra el apartamento:");
        int floor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduzca el número de puerta del apartamento:");
        String door = scanner.nextLine();

        System.out.println("Introduzca el número de propietarios:");
        int owners = scanner.nextInt();
        scanner.nextLine();

        return new Apartment(floor, door, owners);
    }
}
