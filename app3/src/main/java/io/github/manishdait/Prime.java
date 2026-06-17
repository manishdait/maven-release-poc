package io.github.manishdait;

import java.util.List;
import java.util.ArrayList;

public class Prime {
  public static void run() {
    int n = 3;
    System.out.println(prime(n));
    System.out.println(print(100));
  }

  static List<Integer> print(int n) {
    List<Integer> list = new ArrayList<>();
    
    for (int i = 1; i < n; i++) {
      if (prime(i)) {
        list.add(i);    
      }
    }

    return list;
  }

  static boolean prime(int n) {
    if (n < 2) {
      return false;
    }

    /*
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    */

    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0 || n % (n/i) == 0) {
        return false;
      }
    }

    return true;
  }
}
