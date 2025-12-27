package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DuplicateTest {

  @Test
  public void simpleSuccessTest() {
    var duplicate = new Duplicate();
    assertTrue(duplicate.hasDuplicate(new int[] { 1, 2, 3, 3 }));

  }

  @Test
  public void simpleFalseTest() {
    var duplicate = new Duplicate();
    assertFalse(duplicate.hasDuplicate(new int[] { 1, 2, 3, 4 }));
  }
}
