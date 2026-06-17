package io.github.manishdait;

public class MissingNumber {
  public static void run() {
    int n = 5;
    int[] arr = { 1, 2, 4, 5 };

    System.out.println(missing(arr, n));
  }

  static int missing(int[] arr, int n) {
    boolean[] map = new boolean[n];

    for (int i = 0; i < arr.length; i++) {
      map[arr[i] - 1] = true;
    }

    for (int i = 0; i < map.length; i++) {
      if (!map[i]) {
        return i + 1;
      }
    }
    
    return -1;
  }
}
