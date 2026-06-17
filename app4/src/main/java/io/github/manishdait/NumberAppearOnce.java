package io.github.manishdait;// import java.util.HashMap;

public class NumberAppearOnce {
  public static void run() {
    int[] arr = { 4, 1, 2, 1, 2 };
    System.out.println(once(arr));
  }
  
  static int once(int[] arr) {
    // java.util.Map<Integer, Integer> map = new HashMap<>();
    
    // for (int i = 0; i < arr.length; i++) {
    //   map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    // }

    // for (Integer key : map.keySet()) {
    //   if (map.get(key) == 1) {
    //     return key;
    //   }
    // }

    // return -1;

    int xor = 0;
    for (int i = 0; i < arr.length; i++) {
      xor ^= arr[i];
    }

    return xor;
  }
}
