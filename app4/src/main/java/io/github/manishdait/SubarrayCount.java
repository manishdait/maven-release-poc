package io.github.manishdait;

import java.util.Map;
import java.util.HashMap;

public class SubarrayCount {
  public static void run() {
    int[] arr = {3, 1, 2, 4};
    int k = 6;

    System.out.println(count(arr, k));
  }

  static int count(int[] arr, int k) {
    /*
    int count = 0;

    for(int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum += arr[j];

        if(sum == k) {
          count++;
        }
      }
    }

    return count;
    */

    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0,1);

    int psum = 0;
    for (int i = 0; i < arr.length; i++) {
      psum += arr[i];
      
      int required = psum - k;

      if(map.containsKey(required)) {
        count += map.get(required);
      }

      map.put(psum, map.getOrDefault(psum, 0) + 1);
    }

    return count;
  }
}
