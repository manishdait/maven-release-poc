package io.github.manishdait;

import java.util.Arrays;

public class RightRotate {
  public static void run() {
    int[] arr = { 1,2,3,4,5,6,7 };
    System.out.println(Arrays.toString(arr));
    rotateByN(arr, 3);
    System.out.println(Arrays.toString(arr));
  }

  static void rotateByOne(int[] arr) {
    int t = arr[arr.length - 1];
    for (int i = arr.length - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = t;
  }

  static void rotateByN(int[] arr, int n) {
    // int[] tmp = new int[arr.length];

    // n = n % arr.length;

    // if (n == 0) {
    //   return;
    // }

    // int p = 0;
    // for (int i = arr.length - n; i < arr.length; i++) {
    //   System.out.println(arr[i]);
    //   tmp[p++] = arr[i];
    // }

    // for (int i = 0; i < arr.length - n; i++) {
    //   tmp[p++] = arr[i];
    // }

    // for (int i = 0; i < arr.length; i++) {
    //   arr[i] = tmp[i];
    // }

    n = n % arr.length;
    if (n == 0) {
      return;
    }

    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, n - 1);
    reverse(arr, n, arr.length - 1);
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
