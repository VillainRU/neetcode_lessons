package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class sumTest {
  @Test
  public void SimpleSuccessTest() {
    var sum = new Sum();
    assertArrayEquals(new int[] { 0, 1 }, sum.twoSum(new int[] { 3, 4, 5, 6 }, 7));
    assertArrayEquals(new int[] { 0, 2 }, sum.twoSum(new int[] { 4, 5, 6 }, 10));

  }
}
