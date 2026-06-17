package io.github.manishdait;/*
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
*/
import java.util.Arrays;

public class NextPermutation {
  public static void run() {
    int[] arr = {1,2,3};
    /*
    List<List<Integer>> list = new ArrayList<>();
    permute(arr, new ArrayList<>(), 0, list); 

    Collections.sort(list, new Comparator<List<Integer>>() {
      @Override
      public int compare(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
          if (list1.get(i).compareTo(list2.get(i)) != 0) {
            return list1.get(i).compareTo(list2.get(i));
          }
        }

        return 0;
      }
    });
    System.out.println(list);
    */

    nextPermute(arr);
    System.out.println(Arrays.toString(arr));
  }

  /*
  static void permute(int[] arr, List<Integer> tmp, int i, List<List<Integer>> list) {
    if (i >= arr.length) {
      list.add(tmp);
      return;
    }

    int a = arr[i];

    for (int p = 0; p <= tmp.size(); p++) {
      List<Integer> l = new ArrayList<>();
      
      for (int j = 0; j < p; j++) {
        l.add(tmp.get(j));
      }

      l.add(a);

      for (int j = p; j < tmp.size(); j++) {
        l.add(tmp.get(j));
      }

      permute(arr, l, i+1, list);
    }
  }
  */

  static void nextPermute(int[] arr) {
    if (arr.length < 2) {
      return;
    }

    int breakPoint = -1;

    for (int i = arr.length - 1; i > 0; i--) {
      if (arr[i] > arr[i-1]) {
        breakPoint = i-1;
        break;
      }
    }

    if (breakPoint == -1) {
      reverse(arr, 0, arr.length - 1);
      return;
    }
    
    int minRight = 0;
    
    for (int i = arr.length - 1; i > breakPoint; i--) {
      if (arr[i] > arr[breakPoint]) {
        minRight = i;
        break;
      }
    }
 

    int t = arr[minRight];
    arr[minRight] = arr[breakPoint];
    arr[breakPoint] = t;

    reverse(arr, breakPoint + 1, arr.length-1);
  }

  static void reverse(int[] arr, int s, int e) {
    while (s <= e) {
      int t = arr[s];
      arr[s] = arr[e];
      arr[e] = t;
      e--;
      s++;
    }
  }
}
