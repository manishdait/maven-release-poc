package io.github.manishdait;

import java.util.Arrays;

public class RearangeNeg {
  public static void run() {
    int[] arr = { 1, 2, -4, -5 };
    System.out.println(Arrays.toString(arr));
    rearange(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void rearange(int[] arr) {
    int[] tmp = new int[arr.length];
    int p = 0;
    int n = 1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        tmp[p] = arr[i];
        p += 2;
      } else {
        tmp[n] = arr[i];
        n += 2;
      }
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = tmp[i];
    }
  }
}
