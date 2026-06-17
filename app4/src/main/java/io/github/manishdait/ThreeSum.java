package io.github.manishdait;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class ThreeSum {
  public static void run() {
    int[] arr = {-1, 0, 1, 2, -1, -4};
    int k = 0;

    System.out.println(threeSum(arr, k));
  }

  static List<List<Integer>> threeSum(int[] arr, int t) {
    /*
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        for (int k = j+1; k < arr.length; k++) {
          int sum = arr[i] + arr[j] + arr[k];

          if(sum == t) {
            return new int[] {arr[i], arr[j], arr[k]};
          }
        }
      }
    }

    return new int[] {-1};
    */

    /*
    for (int i = 0; i < arr.length; i++) {
      Set<Integer> set = new HashSet<>();
      for (int j = i + 1; j < arr.length; j++) {
        int required = t - (arr[i] + arr[j]);

        if (set.contains(required)) {
          return new int[] {arr[i], arr[j], required};
        }

        set.add(arr[j]);
      }
    }

    return new int[] {-1};
    */

    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      if(i != 0 && arr[i] == arr[i-1]) {continue;}

      int j = i + 1;
      int k = arr.length - 1;

      while (j < k) {
        int sum = arr[i] + arr[j] + arr[k];

        if (sum == t) {
          List<Integer> pair = List.of(arr[i], arr[j], arr[k]);
          list.add(pair);
          j++;
          k--;

          if (j < k && j == arr[j-1]) {j++;}
          if (j < k && k == arr[k+1]) {k--;}
        }

        if (sum > t) {
          k--;
        } else if (sum < t) {
          j++;
        }
      }
    }

    return list;
  }
}
