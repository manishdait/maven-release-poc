package io.github.manishdait;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Divisor {
  public static void run() {
    int n = 36;
    System.out.println(divisor(n));
  }

  static List<Integer> divisor(int n) {
    List<Integer> list = new ArrayList<>();

    /*
    for (int i = 1; i <= n; i++) {
      if (n%i == 0) {
        list.add(i);
      }
    }
    */

    for (int i = 1; i * i <= n; i++) {
      if (n%i == 0) {
        list.add(i);

        if (i != n/i) {
          list.add(n/i);
        }  
      }
    }

    Collections.sort(list);

    return list;
  }
}
