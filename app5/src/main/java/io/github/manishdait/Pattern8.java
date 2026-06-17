package io.github.manishdait;

public class Pattern8 {
  public static void run() {
    print(5);
  }
  
  static void print(int n) {
    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < ((n - i) * 2) - 1; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }

      System.out.print("\n");
    }
  }
}
