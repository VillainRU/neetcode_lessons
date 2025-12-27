package org.example;

public class Palindrome {

  public boolean isPalindrome(String s) {

    Boolean result = true;

    // for (int i = 0; i < s.length() / 2; i++) {
    // if (!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
    // result = false;
    // break;
    // }
    // }
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      while ((l < r) && !(Character.isLetterOrDigit(s.charAt(l)))) {
        l++;
      }

      while ((r > l) && !(Character.isLetterOrDigit(s.charAt(r)))) {
        r--;
      }

      if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
        result = false;
        break;
      }

      l++;
      r--;
    }

    return result;
  }
}
