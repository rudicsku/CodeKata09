package org.example.Rules;

import org.example.Items.Item;

import java.util.Map;

public class SimplePricing implements PricingEngine {

    private double totalPrice = 0;

    @Override
    public double calculatePrice(Map<Integer, Item> items) {
        for (Integer integer : items.keySet()) {
            Item actual = items.get(integer);
            totalPrice += actual.getPrice() * actual.getQuantity();
        }
        return totalPrice;
    }
}
