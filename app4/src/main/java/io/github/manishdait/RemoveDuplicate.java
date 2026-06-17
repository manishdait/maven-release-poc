package io.github.manishdait;

import java.util.Arrays;

public class RemoveDuplicate {
  public static void run() {
    int[] arr = {1,1,1,2,2,3,3,3,3,4,4};
    System.out.println(Arrays.toString(arr));
    System.out.println(remove(arr));
    System.out.println(Arrays.toString(arr));
  }
  
  static int remove(int[] arr) {
    int prev = arr[0];
    int p = 0;

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == prev) {
        continue;
      }

      p++;
      arr[p] = arr[i];
      prev = arr[i];
    }

    return p + 1;
  }
}
