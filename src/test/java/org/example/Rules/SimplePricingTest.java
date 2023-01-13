package org.example.Rules;

import org.example.Items.Item;
import org.example.Items.ItemFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;


class SimplePricingTest {

    private final Map<Integer, Item> items = ItemFactory.getItems();

    private final SimplePricing simplePricing = new SimplePricing();


    @Test
    void calculatePriceTest() {
        //Arrange
        double expectedResult = 2480;

        //Act
        double actual = simplePricing.calculatePrice(items);

        //Assert
        Assertions.assertEquals(expectedResult, actual);
    }
}