package io.github.manishdait;

import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
  public static void run() {
    int n = 5;
    int row = 5;
    int col = 3;

    System.out.println("\n" + variation1(n)  + "\n");
    System.out.println("\n" + variation2(row)  + "\n");
    System.out.println("\n" + variation3(row, col)  + "\n");
  }

  static List<List<Integer>> variation1(int k) {
    List<List<Integer>> list = new ArrayList<>();
    /*
    for (int i = 0; i < k; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        int n = i;
        int r = j;

        int nCr = nCr(n, r);

        row.add(nCr);
      }

      list.add(row);
    }
    */


    for (int i = 1; i <= k; i++) {
      List<Integer> row = new ArrayList<>();
      int tmp = 1;
      row.add(tmp);
      for(int j = 1; j < i; j++) {
        int val = tmp * (i-j) / j;
        tmp = val;
        row.add(tmp);
      }

      list.add(row);
    }

    return list;
  }

  static List<Integer> variation2(int row) {
    List<Integer> list = new ArrayList<>();

    /*
    for (int i = 0; i < row; i++) {
      int nCr = nCr(row - 1, i);
      list.add(nCr);
    }
    */
    
    int prev = 1;
    list.add(prev);

    for (int i = 1; i < row; i++) {
      int val = prev * (row - i) / i;
      prev = val;
      list.add(val);
    }
    return list;
  }

  static int variation3(int row, int col) {
    return nCr(row - 1, col - 1);
  }

  static int nCr(int n, int r) {
    int nfact = 1;
    // int rfact = 1;

    for (int i = r+1; i <= n; i++) {
      nfact *= i;
    }

    /*
    for (int i = 1; i <= n; i++) {
      nfact *= i;
    }
 
    for (int i = 1; i <= r; i++) {
      rfact *= i;
    }
    */

    int diff = 1;
    for (int i = 1; i <= (n-r); i++) {
      diff *= i;
    }

    // return nfact / (diff * rfact); 
    return nfact / diff;
  }
}
