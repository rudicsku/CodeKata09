package org.example.Items;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

   private static final Map<Integer, Item> items = new HashMap<>();

   static {
       items.put(1, new Item("Apple", 55, 3));
       items.put(2, new Item("Orange", 60, 5));
       items.put(3, new Item("Ball", 200, 1));
       items.put(4, new Item("Peach", 80, 4));
       items.put(5, new Item("Salad", 40, 1));
       items.put(6, new Item("Pear", 67, 2));
       items.put(7, new Item("Coffee", 123, 1));
       items.put(8, new Item("Television", 800, 1));
       items.put(9, new Item("Calculator", 200, 1));
       items.put(10, new Item("Pizza", 99, 2));
   }

    public static Map<Integer, Item> getItems() {
        return items;
    }
}
