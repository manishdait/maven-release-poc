package io.github.manishdait;

import java.util.Arrays;

public class StockBuy {
  public static void run() {
    int[] arr = { 7,6,4,3,1};

    System.out.println(profit(arr));
    System.out.println(Arrays.toString(days(arr)));
  }

  static int[] days(int[] arr) {
    int max = 0;
    int buy = arr[0];

    int bd = 0;
    int sd = 0;

    for (int i = 0; i < arr.length; i++) {
      int profit = arr[i] - buy;

      if (profit > max) {
        max = profit;
        sd = i;
      }

      if (buy > arr[i]) {
        bd = i;
        buy = arr[i];
      }
    }

    return new int[] { bd, sd };
  }

  static int profit(int[] arr) {
    // int max = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    //   for (int j = i + 1; j < arr.length; j++) {
    //     int profit = arr[j] - arr[i];
    //     if (profit > max) {
    //       max = profit;
    //     }
    //   }
    // }

    // return max;

    int max = 0;
    int buy = arr[0];

    for (int i = 0; i < arr.length; i++) {
      int profit = arr[i] - buy;
      if (profit > max) {
        max = profit;
      }

      if (arr[i] < buy) {
        buy = arr[i];
      }
    }

    return max;
  }
}
