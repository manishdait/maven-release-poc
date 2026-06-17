package io.github.manishdait;// import java.util.HashMap;
// import java.util.Map;

public class MajorityElement {
  public static void run() {
    int[] arr = { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
    System.out.println(majority(arr));
  }
  
  static int majority(int[] arr) {
    // Map<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i < arr.length; i++) {
    //   map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    // }
    
    // int n = arr.length;

    // for (Integer key : map.keySet()) {
    //   if (map.get(key) > n / 2) {
    //     return key;
    //   }
    // }

    // return -1;

    int ele = arr[0];
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
      if (count == 0) {
        ele = arr[i];
        count = 1;
      } else if (ele == arr[i]) {
        count++;
      } else {
        count--;
      }
    }

    // verify ele if not mention that ele is present;
    // int vcount = 0;
    // for (int i = 0; i < arr.length; i++) {
    //   if (arr[i] == ele) {
    //     vcount++;
    //   }
    // }

    // if (vcount > arr.length / 2) {
    //   return ele;
    // } else {
    //   return -1;
    // }

    return ele;
  } 
}
