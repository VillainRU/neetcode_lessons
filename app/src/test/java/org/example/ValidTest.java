package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class validTest {
  @Test
  public void SimpleSuccessTest() {
    var valid = new Valid();
    assertTrue(valid.isValid("[]"));
    assertTrue(valid.isValid("([{}])"));
    assertTrue(valid.isValid("{[(())]}"));
    assertTrue(valid.isValid("[]{}()"));
  }

  @Test
  public void SimpleFalseTest() {
    var valid = new Valid();
    assertFalse(valid.isValid("[(])"));
    assertFalse(valid.isValid("((())"));
  }
}
