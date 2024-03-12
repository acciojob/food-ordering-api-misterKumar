package com.driver.test;


import com.driver.Food;
import com.driver.Menu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestCases {

    @Test
    public void testAddMenuItemAndGetMenuItems() {
        Menu menu = new Menu();
        // Assert that initially, the menu is empty
        assertEquals(1, menu.getMenuItems().size());

        // Add a new item to the menu
        menu.addMenuItem(new Food(2, "Sushi", 12.99));

        // Assert that after adding an item, the menu size should be 5
        assertEquals(2, menu.getMenuItems().size());
    }

    @Test
    public void testGetMenuItemById() {
        Menu menu = new Menu();
        // Get an item from the menu by ID
        Food food = menu.getMenuItemById(1);

        // Assert that the returned item is not null
        assertNotNull(food);
        // Add more specific assertions here if needed, like checking the name or price of the item
    }
}

