package org.example.Rules;

import org.example.Items.Item;
import org.example.Items.ItemFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class HalfPriceTest {

    private final Map<Integer, Item> items = ItemFactory.getItems();

    private final HalfPrice halfPrice = new HalfPrice();



    @Test
    void calculatePriceTest() {
        //Arrange
        int expectedResult = 1240;

        //Act
        double actual = halfPrice.calculatePrice(items);

        //Assert
        Assertions.assertEquals(expectedResult, actual);
    }
}