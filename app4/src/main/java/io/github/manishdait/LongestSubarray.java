package io.github.manishdait;// import java.util.HashMap;
// import java.util.Map;

public class LongestSubarray {
  public static void run() {
    int[] arr = { 2,3,5 };
    int k = 5;

    System.out.println(longest(arr, k));
  }

  // static int longest(int[] arr, int s) {
  //   int maxLen = 0;

  //   for (int i = 0; i < arr.length; i++) {
  //     for (int j = i; j < arr.length; j++) {
  //       int sum = 0;
  //       for (int k = i; k <= j; k++) {
  //         sum += arr[k];
  //       }

  //       if (sum == s) {
  //         maxLen = Math.max(j - i + 1, maxLen);
  //       }
  //     }
  //   }

  //   return maxLen;
  // }

  // static int longest(int[] arr, int s) {
  //   int maxLen = 0;

  //   for (int i = 0; i < arr.length; i++) {
  //     int sum = 0;

  //     for (int j = i; j < arr.length; j++) {
  //       sum += arr[j];

  //       if (sum == s) {
  //         maxLen = Math.max(maxLen, j - i + 1);
  //       }
  //     }
  //   }

  //   return maxLen;
  // }

  // Works for negative number as optimal
  // static int longest(int[] arr, int s) {
  //   int maxLen = 0;
  //   int psum = 0;

  //   Map<Integer, Integer> map = new HashMap<>();

  //   for (int i = 0; i < arr.length; i++) {
  //     psum += arr[i];

  //     if (psum == s) {
  //       maxLen = Math.max(maxLen, i + 1);
  //     }

  //     if (map.containsKey(psum - s)) {
  //       int len = i - map.get(psum - s);
  //       maxLen = Math.max(maxLen, len);
  //     }

  //     if (!map.containsKey(psum)) {
  //       map.put(psum, i);
  //     }
  //   }

  //   return maxLen;
  // }

  // Not for negative numbers
  static int longest(int[] arr, int k) {
    int maxLen = 0;

    int s = 0;
    int e = 0;

    int sum = 0;

    while (e < arr.length) {
      while (s <= e && sum > k) {
        sum -= arr[s];
        s--;
      }
      
      sum += arr[e];

      if (sum == k) {
        maxLen = Math.max(maxLen, e - s + 1);
      }
      
      e++;
    }

    return maxLen;
  }
}
