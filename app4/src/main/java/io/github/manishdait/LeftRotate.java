package io.github.manishdait;

import java.util.Arrays;

public class LeftRotate {
  public static void run() {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(arr));
    rotateByN(arr, 2);
    System.out.println(Arrays.toString(arr));
  }

  static void rotateByOne(int[] arr) {
    int tmp = arr[0];

    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }

    arr[arr.length - 1] = tmp;
  }

  static void rotateByN(int[] arr, int n) {
    // int[] tmp = new int[arr.length];

    // n = n % arr.length;

    // if (n == 0) {
    //   return;
    // }

    // System.out.println(n);
    // int p = 0;
    // for (int i = n; i < arr.length; i++) {
    //   tmp[p++] = arr[i];
    // }

    // for (int i = 0; i < n; i++) {
    //   tmp[p++] = arr[i];
    // }

    // for (int i = 0; i < arr.length; i++) {
    //   arr[i] = tmp[i];
    // }

    n = n % arr.length;
    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, n);
    reverse(arr, n+1, arr.length - 1);
  }

  static void reverse(int[] arr, int s, int e) {
    while (s <= e) {
      int t = arr[s];
      arr[s] = arr[e];
      arr[e] = t;
      s++;
      e--;
    }
  }
}
