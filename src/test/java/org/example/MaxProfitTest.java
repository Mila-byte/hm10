package org.example;

import org.junit.Assert;
import org.junit.Test;
public class MaxProfitTest {
    @Test
    public void maxProfitTest() {
        MaxProfit profit = new MaxProfit();
        int[] prices = {2, 4, 1};
        int result = profit.calculate(prices);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}
