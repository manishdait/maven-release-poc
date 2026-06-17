package io.github.manishdait;

public class SecondLargest {
  public static void run() {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    System.out.println(smax(arr));
  }

  static int smax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int smax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        smax = max;
        max = arr[i];
      } else {
        if (arr[i] != max && arr[i] > smax) {
          smax = arr[i];
        }
      }
    }

    return smax;
  }
}
