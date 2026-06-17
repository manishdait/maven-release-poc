package io.github.manishdait;

import java.util.Arrays;

public class MergeSort {
  public static void run() {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    System.out.println(Arrays.toString(arr));
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    mergeSort(arr, 0, arr.length - 1);
  }

  static void mergeSort(int[] arr, int s, int e) {
    if (s >= e) {
      return;
    }

    int m = s + (e - s) / 2;
    mergeSort(arr, s, m);
    mergeSort(arr, m + 1, e);
    merge(arr, s, e, m);
  }

  static void merge(int[] arr, int s, int e, int m) {
    int i = s;
    int j = m+1;
    int k = 0;
    int[] tmp = new int[e - s + 1];

    while (i <= m && j <= e) {
      if (arr[i] <= arr[j]) {
        tmp[k++] = arr[i++];
      } else {
        tmp[k++] = arr[j++];
      }
    }

    while (i <= m) {
      tmp[k++] = arr[i++];
    }

    while (j <= e) {
      tmp[k++] = arr[j++];
    }

    for (int p = 0; p < tmp.length; p++) {
      arr[s + p] = tmp[p];
    }
  }
}
