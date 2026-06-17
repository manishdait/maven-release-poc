package io.github.manishdait;

import java.util.Arrays;

public class MajorityN3 {
  public static void run() {
    int[] arr = {3,2,3};

    System.out.println(Arrays.toString(majority(arr)));
  } 

  static int[] majority(int[] arr) {
    int e1 = Integer.MIN_VALUE;
    int e2 = Integer.MIN_VALUE;

    int c1 = 0;
    int c2 = 0;

    for (int i = 0; i < arr.length; i++) {
      if (c1 == 0 && e2 != arr[i]) {
        e1 = arr[i];
        c1++;
      } else if (c2 == 0 && e1 != arr[i]) {
        e2 = arr[i];
        c2++;
      } else if (e1 == arr[i]) {
        c1++;
      } else if (e2 == arr[i]) {
        c2++;
      } else {
        c1--;
        c2--;
      }
    }

    int n = arr.length;

    int ac1 = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == e1) {
        ac1++;
      }
    }

    int ac2 = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == e2) {
        ac2++;
      }
    }

    int[] ans = {-1, -1};

    if (ac1 > n/3) {
      ans[0] = e1;
    }
    if (ac2 > n/3) {
      ans[1] = e2; 
    }

    return ans;
  }
}
