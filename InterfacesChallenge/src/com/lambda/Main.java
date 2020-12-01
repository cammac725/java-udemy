package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player cam = new Player("Cam", 10, 15);
        System.out.println(cam.toString());
        saveObject(cam);

        cam.setHitPoints(8);
        System.out.println(cam);
        cam.setWeapon("DarkLightning");
        saveObject(cam);
//        loadObject(cam);
        System.out.println(cam);

        ISavable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                        "1 to enter a string\n" +
                        "0 to quit");

        while (!quit) {
            System.out.println("Choose and option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        int objectLength = objectToSave.write().size();
        for (int i = 0; i < objectLength; i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
