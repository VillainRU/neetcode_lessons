package org.example;

import java.util.HashMap;

public class Duplicate {
  public Boolean hasDuplicate(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<>();
    Boolean result = false;

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        result = true;
        break;
      } else {
        map.put(nums[i], i);
      }
    }
    return result;
  }

}
