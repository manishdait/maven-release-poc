package io.github.manishdait;

import java.util.ArrayList;
import java.util.List;

public class MergeINtervals {
 public static void run() {
  int[][] arr = {
    {1,3},
    {2,6},
    {8,10},
    {15,18}
  };

  System.out.println(overlapIntervals(arr));
 }

 static List<List<Integer>> overlapIntervals(int[][] arr) {
  sort(arr);
  List<List<Integer>> list = new ArrayList<>();

  int start = arr[0][0];
  int end = arr[0][1];

  for (int i = 0; i < arr.length; i++) {
    int newStart = arr[i][0];
    int newEnd = arr[i][1];

    if (newStart > start && newStart > end) {
      list.add(List.of(start, end));
      start = newStart;
      end = newEnd;
    } else {
      if (newEnd > end) {
        end = newEnd;
      }
    }
  }

  list.add(List.of(start, end));

  return list;
 }

 static void sort(int[][] arr) {
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length - 1; j++) {
      if (arr[j][0] == arr[j+1][0]) {
        if (arr[j][1] > arr[j+1][1]) {
          int[] t = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = t;
        }
      } else {
        if (arr[j][0] > arr[j+1][0]) {
          int[] t = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = t;
        }
      }
    }
  }
 }
}
