package org.example;

import org.example.Items.Item;
import org.example.Items.ItemFactory;
import org.example.Rules.HalfPrice;
import org.example.Rules.SimplePricing;
import org.example.Rules.TwoPlusOne;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Item> items = ItemFactory.getItems();

        SimplePricing simplePricing = new SimplePricing();
        System.out.println(simplePricing.calculatePrice(items));

        TwoPlusOne twoPlusOne = new TwoPlusOne(List.of("Apple", "Television"));
        System.out.println(twoPlusOne.calculatePrice(items));

        HalfPrice halfPrice = new HalfPrice();
        System.out.println(halfPrice.calculatePrice(items));

    }
}