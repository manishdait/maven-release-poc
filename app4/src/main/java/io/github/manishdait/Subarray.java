package io.github.manishdait;

import java.util.Map;
import java.util.HashMap;

public class Subarray {
  public static void run() {
    int[] arr = {2,3,5,1,9};
    int k = 10;

    System.out.println(longest(arr, k));
    printLongest(arr, k);
  }

  static int longest(int[] arr, int k) {
    /*
    int longest = 0;

    for(int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum += arr[j];
        if (sum == k) {
          longest = Math.max(longest, j - i + 1);
        }
      }
    }

    return longest;
    */
    
    Map<Integer, Integer> map = new HashMap<>();
    int longest = 0;
    int psum = 0;

    for (int i = 0; i < arr.length; i++) {
      psum += arr[i];

      if (psum == k) {
        longest = Math.max(longest, i + 1);
      }

      if (map.containsKey(psum - k)) {
        int len = i - map.get(psum - k);
        longest = Math.max(longest, len);
      }

      if(!map.containsKey(psum)) {
        map.put(psum, i);
      }
    }

    return longest;
  }

  static void printLongest(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    int longest = 0;
    int psum = 0;

    int ansStart = -1;
    int ansEnd = -1;
    for (int i = 0; i < arr.length; i++) {
      psum += arr[i];

      if (psum == k) {
        if (i+1 > longest) {
          longest = i+1;
          ansStart = 0;
          ansEnd = i;
        }
       // longest = Math.max(longest, i + 1);
      } 

      if (map.containsKey(psum - k)) {
        int len = i - map.get(psum - k);
        if (len > longest) {
          longest = len;
          ansStart = map.get(psum - k) + 1;
          ansStart = i;
        }
        // longest = Math.max(longest, len);
      }

      if(!map.containsKey(psum)) {
        map.put(psum, i);
      }
    }

    for (int i = ansStart; i <= ansEnd; i++) {
      System.out.println(arr[i]);
    }
  }
}
