package io.github.manishdait;

import java.util.List;
import java.util.ArrayList;

public class Leader {
  public static void run() {
    int[] arr = {10, 22, 12, 3, 0, 6};
    System.out.println(leader(arr));
  }
  
  static List<Integer> leader(int[] arr) {
    List<Integer> list = new ArrayList<>();
    
    int leader = arr[arr.length - 1];
    list.add(leader);

    for (int i = arr.length - 2; i >= 0; i--) {
      if (arr[i] > leader) {
        leader = arr[i];
        list.add(0, leader);
      }
    }

    return list;
  }
}
