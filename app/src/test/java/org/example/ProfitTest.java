package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProfitTest {

  @Test
  public void SimpleSuccessTest() {
    var profit = new Profit();
    assertEquals(6, profit.maxProfit(new int[] { 10, 1, 5, 6, 7, 1 }));
  }
}
