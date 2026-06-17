package io.github.manishdait;

import java.util.Arrays;

public class DutchNationalFlag {
  public static void run() {
    int[] arr = { 2, 0, 2, 1, 1, 0 };
    System.out.println(Arrays.toString(arr));
    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  // Basic merge sort or Quicksort,
      
  public static void sort(int[] arr) {
    // int z = 0;
    // int o = 0;
    // int t = 0;

    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i] == 0) {
    //     z++;
    //   } else if (arr[i] == 1) {
    //     o++;
    //   } else {
    //     t++;
    //   }
    // }

    // for (int i = 0; i < arr.length; i++) {
    //   if (z > 0) {
    //     arr[i] = 0;
    //     z--;
    //   } else if (o > 0) {
    //     arr[i] = 1;
    //     o--;
    //   } else if (t > 0) {
    //     arr[i] = 2;
    //     t--;
    //   }
    // }

    int l = 0;
    int m = 0;
    int h = arr.length - 1;

    while (m <= h) {
      if (arr[m] == 0) {
        swap(arr, m, l);
        l++;
        m++;
      } else if (arr[m] == 1) {
        m++;
      } else {
        swap(arr, m, h);
        h--;
      }
    }
  }

  static void swap(int[] arr, int a, int b) {
    int t = arr[a];
    arr[a] = arr[b];
    arr[b] = t;
  }
}
