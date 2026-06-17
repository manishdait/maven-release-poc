package io.github.manishdait;

public class LinearSearch {
  public static void run() {
    int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
    System.out.println(search(arr, 20));
  }

  static int search(int[] arr, int t) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == t) {
        return i;
      }
    }

    return -1;
  }
}
