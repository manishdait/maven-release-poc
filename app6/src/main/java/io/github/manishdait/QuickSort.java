package io.github.manishdait;

import java.util.Arrays;

public class QuickSort {
  public static void run() {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    System.out.println(Arrays.toString(arr));
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  static void sort(int[] arr) {
    quicksort(arr, 0, arr.length - 1);
  }

  static void quicksort(int[] arr, int s, int e) {
    if (s >= e) {
      return;
    }

    int i = s;
    int j = e;
    int m = s + (e - s) / 2;
    int p = arr[m];

    while (i <= j) {
      while (arr[i] < p) {
        i++;
      }

      while (arr[j] > p) {
        j--;
      }

      if (i <= j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        i++;
        j--;
      }
    }

    quicksort(arr, s, j);
    quicksort(arr, i, e);
  }
}
