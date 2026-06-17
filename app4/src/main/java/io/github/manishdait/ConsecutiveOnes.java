package io.github.manishdait;

public class ConsecutiveOnes {
  public static void run() {
    int[] arr = { 1, 0, 1, 1, 0, 1 };
    System.out.println(maxConsecutive(arr));
  }

  static int maxConsecutive(int[] arr) {
    int max = 0;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        sum = 0;
        continue;
      }
      sum++;
      max = Math.max(sum, max);
    }

    return max;
  }
}
