package io.github.manishdait;

import java.util.Arrays;

public class MoveZero {
  public static void run() {
    int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };

    System.out.println(Arrays.toString(arr));
    moveZero(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  static void moveZero(int[] arr) {
    int z = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        z = i;
        break;
      }
    }

    if (z == -1) {
      return;
    }

    for (int i = z + 1; i < arr.length; i++) {
      if (arr[i] == 0) {
        continue;
      }

      arr[z] = arr[i];
      arr[i] = 0;
      z++;
    }
  }
}
