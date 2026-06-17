package io.github.manishdait;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class FourSum {
  public static void run() {
    int[] arr = {1,0,-1,0,-2,2};
    int k = 0;

    System.out.println(foursum(arr, k));
  }

  static List<List<Integer>> foursum(int[] arr, int t) {
    List<List<Integer>> list = new ArrayList<>();

    /*
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          for (int l = k + 1; l < arr.length; l++) {
            int sum = arr[i] + arr[j] + arr[k] + arr[l];
            if (sum == t) {
              list.add(List.of(arr[i], arr[j], arr[k], arr[l]));
            }
          }
        }
      }
    }
    */

    /*
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        Set<Integer> set = new HashSet<>();
        for (int k = j+1; k < arr.length; k++) {
          int required = t - (arr[i] + arr[j] + arr[k]);
          
          if (set.contains(required)) {
            list.add(List.of(arr[i], arr[j], arr[k], required));
          }

          set.add(arr[k]);
        }
      }
    }
    */

    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (i != 0 && arr[i] == arr[i-1]) {
        continue;
      }

      for (int j = i + 1; j < arr.length; j++) {
        if (j != 1 && arr[j] == arr[j-1]) {
          continue;
        }

        int k = j+1;
        int l = arr.length - 1;

        while (k < l) {
          int sum = arr[i] + arr[j] + arr[k] + arr[l];

          if(sum == t) {
            list.add(List.of(arr[i], arr[j], arr[k], arr[l]));
            k++;
            l--;

            while (k < l && arr[k] == arr[k-1]) {k++;}
            while (k < l && arr[l] == arr[l+1]) {l--;}
          } else if (sum > t) {
            l--;
          } else if (sum < t) {
            k++;
          }
        }
      }
    }
    return list;
  }
}
