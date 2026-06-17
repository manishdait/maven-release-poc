package io.github.manishdait;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayZeroSum {
  public static void run() {
    int[] arr = {9, -3, 3, -1, 6, -5};
    System.out.println(maxLen(arr));
  } 

  static int maxLen(int[] arr) {
    int max = 0;

    int psum = 0;
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      psum += arr[i];
      if (psum == 0) {
        max = Math.max(max, i+1);
      }

      if (map.containsKey(psum)) {
        int len = i - map.get(psum);
        max = Math.max(max, len);
      } else {
        map.put(psum, i);
      }
    }

    return max;
  }
}
