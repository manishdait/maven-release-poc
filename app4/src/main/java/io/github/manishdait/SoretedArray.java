package io.github.manishdait;

public class SoretedArray {
  public static void run() {
    int[] arr = { 4, 3, 2, 1 };
    System.out.println(sorted(arr));
  }

  static boolean sortedInc(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }

    return true;
  }

  static boolean sortedDec(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        return false;
      }
    }

    return true;
  }

  static boolean sorted(int[] arr) {
    return sortedInc(arr) || sortedDec(arr);
  }
}
