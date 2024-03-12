package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Food> menuItems;

    public Menu() {
    	// your code goes here
        menuItems=new ArrayList<>();
        menuItems.add(new Food(1, "Burger", 5.99));

    }

    public void addMenuItem(Food food) {
    	// your code goes here
        menuItems.add(food);
    }

    public List<Food> getMenuItems() {
    	// your code goes here
        return menuItems;
    }

    public Food getMenuItemById(int id) {
    	// your code goes here
        for (Food item : menuItems) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}