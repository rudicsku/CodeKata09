package org.example.Rules;

import org.example.Items.Item;

import java.util.List;
import java.util.Map;

public class TwoPlusOne implements PricingEngine {

    private final List<String> itemsInSale;
    private double totalPrice = 0;

    public TwoPlusOne(List<String> itemsInSale) {
        this.itemsInSale = itemsInSale;
    }

    @Override
    public double calculatePrice(Map<Integer, Item> items) {
        int freeItem;

        for (Integer integer : items.keySet()) {
            Item actual = items.get(integer);
            if (itemsInSale.contains(actual.getName())) {
                freeItem = actual.getQuantity() / 3;
                totalPrice += (actual.getQuantity() - freeItem) * actual.getPrice();
            } else {
                totalPrice += actual.getPrice() * actual.getQuantity();
            }
        }
        return totalPrice;
    }
}
