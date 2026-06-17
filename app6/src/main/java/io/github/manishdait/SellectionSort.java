package io.github.manishdait;

import java.util.Arrays;

public class SellectionSort {
  public static void run() {
    int[] arr = {13,46,24,52,20,9};
    System.out.println(Arrays.toString(arr));

    sort(arr);

    System.out.println(Arrays.toString(arr));
  }
  
  static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int small = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[small] > arr[j]) {
          small = j;
        }
      }

      int t = arr[small];
      arr[small] = arr[i];
      arr[i] = t;
    }
  }
}
