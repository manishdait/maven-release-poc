package io.github.manishdait;

import java.util.Arrays;

public class InsertionSort {
  public static void run() {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    System.out.println(Arrays.toString(arr));
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j - 1] > arr[j]) {
          int t = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = t;
        } else {
          break;
        }
      }
    }
  }
}
