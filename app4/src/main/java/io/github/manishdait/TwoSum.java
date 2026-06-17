package io.github.manishdait;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void run() {
    int[] arr = { 2, 6, 5, 8, 11 };
    int target = 14;

    System.out.println(Arrays.toString(twosum(arr, target)));
  }

  static int[] twosum(int[] arr, int target) {
    // for (int i = 0; i < arr.length - 1; i++) {
    //   for (int j = i + 1; j < arr.length; j++) {
    //     if (arr[i] + arr[j] == target) {
    //       return new int[] { i, j };
    //     }
    //   }
    // }

    // return new int[] { -1, -1 };

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int diff = target - arr[i];

      if (map.containsKey(diff)) {
        return new int[] { map.get(diff), i };
      }

      map.put(arr[i], i);
    }
    
    return new int[] { -1, -1 };
  }
}
