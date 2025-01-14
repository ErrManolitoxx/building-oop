package org.ies.building;

import org.ies.building.components.*;

import java.util.Scanner;

public class BuildingMenuMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var apartmentReader = new ApartmentReader(scanner, ownerReader);
        var buildingReader = new BuildingReader(scanner, apartmentReader);
        var buildingApp = new BuildingMenuApp(scanner, buildingReader);

        buildingApp.run();

    }
}