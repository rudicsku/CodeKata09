package org.example.Rules;

import org.example.Items.Item;

import java.util.Map;

public interface PricingEngine {

    double calculatePrice(Map<Integer, Item> items);

}
