package com.lambda;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void updateGroceryItem(String currentItem, String newItem) {
        int position = findItemIndex(currentItem);
        if (position >= 0) {
            updateGroceryItem(position, newItem);
        }
    }

    private void updateGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been updated.");
    }

    public void removeGroceryItem(String item) {
        int position = findItemIndex(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
        System.out.println("Grocery item " + (position + 1) + " has been removed.");
    }

    private int findItemIndex(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItemIndex(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
