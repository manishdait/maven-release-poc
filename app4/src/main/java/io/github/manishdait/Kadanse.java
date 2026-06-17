package io.github.manishdait;

public class Kadanse {
  public static void run() {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(maxSum(arr));
    printMaxSubarry(arr);
  }

  static int maxSum(int[] arr) {
    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    //   for (int j = i; j < arr.length; j++) {
    //     int sum = 0;
    //     for (int k = i; k <= j; k++) {
    //       sum += arr[k];
    //     }

    //     if (sum > max) {
    //       max = sum;
    //     }
    //   }
    // }

    // return max;

    // int max = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    //   int sum = 0;
    //   for (int j = i; j < arr.length; j++) {
    //     sum += arr[j];

    //     if (sum > max) {
    //       max = sum;
    //     }
    //   }
    // }

    // return max;

    int max = Integer.MIN_VALUE;
    int curr = 0;

    for (int i = 0; i < arr.length; i++) {
      curr += arr[i];
      if (curr > max) {
        max = curr;
      }

      if (curr < 0) {
        curr = 0;
      }
    }

    return max;
  }

  static void printMaxSubarry(int[] arr) {
    int max = Integer.MIN_VALUE;
    int curr = 0;

    int mi = 0;
    int mj = 0;
    int s = 0;

    for (int i = 0; i < arr.length; i++) {
      if (curr == 0) {
        s = i;
      }

      curr += arr[i];

      if (curr > max) {
        max = curr;
        mi = s;
        mj = i;
      }

      if (curr < 0) {
        curr = 0;
        // s = i + 1;
      }
    }
    
    for (int i = mi; i <= mj; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
