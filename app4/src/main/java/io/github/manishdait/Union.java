package io.github.manishdait;

import java.util.ArrayList;
import java.util.List;

public class Union {
  public static void run() {
    int[] arr1 = { 1,2,3,4,5,6,7,8,9,10 };
    int[] arr2 = { 2,3,4,4,5,11,12 };

    System.out.println(union(arr1, arr2));
  }
  
  static List<Integer> union(int[] a, int[] b) {
    List<Integer> list = new ArrayList<>();

    int i = 0;
    int j = 0;

    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
          list.add(a[i]);
        }
        i++;
      } else {
        if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
          list.add(b[j]);
        }
        j++;
      }
    }

    while (i < a.length) {
      if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
        list.add(a[i]);
      }
      i++;
    }

    while (j < b.length) {
      if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
        list.add(b[j]);
      }
      j++;
    }

    return list;
  }
}
