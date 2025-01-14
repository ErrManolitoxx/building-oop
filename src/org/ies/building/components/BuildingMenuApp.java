package org.ies.building.components;


import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingMenuApp {
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingMenuApp(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {
        Building building = buildingReader.read();
        int option;
        do {
            option = chooseOption();
            if (option == 1) {
                building.showInfo();
            } else if (option == 2) {
                option2(building);

            } else if (option == 3) {
                option3(building);
            } else if (option == 4) {
                option4(building);
            } else if (option == 5) {
                System.out.println("Saliendo ...");
            }
        } while (option != 5);
    }

    private void option4(Building building) {
        System.out.println("Introduce una planta");
        int plant = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce una puerta");
        String door = scanner.nextLine();
        building.findAparment(door, plant);
    }

    private void option3(Building building) {
        System.out.println("Introduce una planta");
        int plant = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce una puerta");
        String door = scanner.nextLine();
        building.findOwners(plant, door);
    }

    private void option2(Building building) {
        System.out.println("Introduce una planta");
        int floor = scanner.nextInt();
        scanner.nextLine();
        building.showFloorAparments(floor);
    }

    private int chooseOption() {
        int option;
        System.out.println("1. Mostrar información del edificio");
        System.out.println("2. Mostrar apartamentos de una planta");
        System.out.println("3. Mostrar datos segun planta y puerta");
        System.out.println("4. Mostrar propietarios de apartamentos segun puerta y planta");
        System.out.println("5. Salir");
        System.out.println("Elige una opción");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}