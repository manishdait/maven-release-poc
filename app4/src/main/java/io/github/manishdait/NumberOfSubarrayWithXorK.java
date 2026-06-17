package io.github.manishdait;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubarrayWithXorK {
  public static void run() {
    int[] arr = {4, 2, 2, 6, 4};
    int k = 6;

    System.out.println(countXor(arr, k));
  }

  static int countXor(int[] arr, int k) {
    int count = 0;

    // for (int i = 0; i < arr.length; i++) {
    //   int xor = 0;
    //   for (int j = i; j < arr.length; j++) {
    //     xor ^= arr[j];
    //     if (xor == k) {
    //       count++;
    //     }
    //   }
    // }

    /*
     *  ---x---|---k---
     *  ================
     *  -----pxor-----i
     * 
     * pxor = x ^ k
     * pxor ^ k = x ^ k ^ k
     * x = pxor ^ k
     */

    int pxor = 0;
    Map<Integer, Integer> map = new HashMap<>();

    map.put(0, 1); // when pxor == k

    for (int i = 0; i < arr.length; i++) {
      pxor ^= arr[i];

      int x = pxor ^ k;
      if (map.containsKey(x)) {
        count += map.get(x);
      } else {
        map.put(pxor, map.getOrDefault(pxor, 0) + 1);
      }
    }

    return count;
  }
}
