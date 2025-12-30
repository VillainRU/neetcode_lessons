package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class RemoveElementTest {
  @Test
  public void SimpleSuccessTest() {
    var removeElement = new RemoveElement();
    assertArrayEquals(new int[] { 2, 3, 4 }, removeElement.removeElement(new int[] { 1, 1, 2, 3, 4 }, 1));
    assertArrayEquals(new int[] { 0, 1, 3, 0, 4 },
        removeElement.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));

  }
}
