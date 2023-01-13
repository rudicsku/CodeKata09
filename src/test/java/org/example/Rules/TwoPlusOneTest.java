package org.example.Rules;

import org.example.Items.Item;
import org.example.Items.ItemFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class TwoPlusOneTest {


    private final Map<Integer, Item> items = ItemFactory.getItems();

    private final List<String> itemsInSale = List.of("Apple", "Orange");

    private final TwoPlusOne twoPlusOne = new TwoPlusOne(itemsInSale);


    @Test
    void calculatePriceTest() {
        //Arrange
        int expectedResult = 2365;

        //Act
        double actual = twoPlusOne.calculatePrice(items);

        //Assert
        Assertions.assertEquals(expectedResult, actual);
    }
}