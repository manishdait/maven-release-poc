package io.github.manishdait;

public class LargetElementArray {
  public static void run() {
    int[] arr = { 13, 46, 24, 52, 20, 9 };
    System.out.println(max(arr));
  }

  static int max(int[] arr) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }
}
