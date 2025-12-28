package org.example;

import java.util.HashMap;
import java.util.Stack;

public class Valid {
  public boolean isValid(String s) {
    HashMap<Character, Character> map = new HashMap<>();
    map.put('{', '}');
    map.put('[', ']');
    map.put('(', ')');

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(s.charAt(i))) {
        stack.push(s.charAt(i));
      } else {
        if (stack.isEmpty()) {
          return false;
        }

        if (map.get(stack.pop()) != s.charAt(i)) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
