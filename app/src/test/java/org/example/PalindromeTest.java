package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeTest {

  @Test
  public void simpleSuccessTest() {
    var palindrome = new Palindrome();
    assertTrue(palindrome.isPalindrome("aba"));
    assertTrue(palindrome.isPalindrome("papap"));
    assertTrue(palindrome.isPalindrome("wasitacaroracatisaw"));
    assertTrue(palindrome.isPalindrome("Was it a car or a cat I saw?"));
    assertTrue(palindrome.isPalindrome("Racecar"));
  }

  @Test
  public void simpleFalseTest() {
    var palindrome = new Palindrome();
    assertFalse(palindrome.isPalindrome("abc"));
    assertFalse(palindrome.isPalindrome("abca"));
    assertFalse(palindrome.isPalindrome("qwerey"));
    assertFalse(palindrome.isPalindrome("baac"));
    assertFalse(palindrome.isPalindrome("faaraad"));
    assertFalse(palindrome.isPalindrome("How are you?"));
    assertFalse(palindrome.isPalindrome("Was it a car or a cat I meow?"));
  }

}
