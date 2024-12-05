package components;

import model.Owner;

import java.util.Scanner;

public class OwnerReader {

    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Owner read() {
        System.out.println("Introduzca el NIF del propietario del apartamento:");
        String nif = scanner.nextLine();

        System.out.println("Introduzca el nombre del usuario:");
        String name = scanner.nextLine();

        System.out.println("Introduzca los apellidos:");
        String surname = scanner.nextLine();
        return new Owner(nif, name, surname);
    }
}
