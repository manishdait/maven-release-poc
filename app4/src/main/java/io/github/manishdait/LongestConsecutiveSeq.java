package io.github.manishdait;//import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {
  public static void run() {
    int[] arr = {3, 8, 5, 7, 6};
    System.out.println(longest(arr));
  }

  static int longest(int[] arr) {
    /*
    Arrays.sort(arr);
    int max = 0;
    int count = 0;
    int prev = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == prev + 1) {
        count++;
      } else if (arr[i] != prev){
        count = 1;
      }

      prev = arr[i];
      max = Math.max(count, max);
    }

    return max;
    */

    if (arr.length == 0) {
      return 0;
    }

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }

    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (!set.contains(arr[i] - 1)) {
        int count = 1;
        int x = arr[i];

        while (set.contains(x+1)) {
          count++;
          x = x+1;
        }

        max = Math.max(max, count);
      }
    }

    return max;
  }
}
