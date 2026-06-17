package io.github.manishdait;

import java.util.Arrays;

public class BubbleSort {
  public static void run() {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    System.out.println(Arrays.toString(arr));
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    int c = 0;
    for (int i = 0; i < arr.length; i++) {
      boolean swap = false;
      for (int j = 0; j < arr.length - i- 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int t = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = t;
          swap = true;
        }
        c++;
      }

      if (!swap) {
        System.out.println(c);;
        return;
      }
    }

    System.out.println(c);
  }
}
