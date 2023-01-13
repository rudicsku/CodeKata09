package org.example.Rules;

import org.example.Items.Item;

import java.util.Map;

public class HalfPrice implements PricingEngine {

    private double totalPrice = 0;
    @Override
    public double calculatePrice(Map<Integer, Item> items) {
        for (Integer integer : items.keySet()) {
            Item actual = items.get(integer);
            totalPrice += ((double) actual.getPrice()/2) * actual.getQuantity();
        }
        return totalPrice;
    }
}
