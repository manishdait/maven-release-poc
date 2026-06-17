package io.github.manishdait;

public class Pattern1 {
  public static void run() {
    print(5);
  }

  static void print(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}