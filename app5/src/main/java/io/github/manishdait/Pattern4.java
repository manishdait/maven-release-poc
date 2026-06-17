package io.github.manishdait;

public class Pattern4 {
  public static void run() {
    print(5);
  }
  
  static void print(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(i + 1);
      }
      System.out.print("\n");
    }
  }
}

