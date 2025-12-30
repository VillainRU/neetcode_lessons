package org.example;

public class RemoveElement {
  public int[] removeElement(int[] nums, int val) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < nums.length; i++) {
      if (!String.valueOf(nums[i]).equals(String.valueOf(val))) {
        sb.append(nums[i]);
      }
    }
    return sb.chars()
        .map(c -> c - '0')
        .toArray();
  }
}
