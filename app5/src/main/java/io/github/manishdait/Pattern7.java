package io.github.manishdait;

public class Pattern7 {
  public static void run() {
    print(5);
  }
  
  static void print(int n) {
    for (int i = 0; i < n; i++) {
      // space
      for (int j = 0; j < n - (i + 1); j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < (2 * i) + 1; j++) {
        System.out.print("*");
      }

      // space
      for (int j = 0; j < n - (i + 1); j++) {
        System.out.print(" ");
      }
      
      System.out.print("\n");
    }
  }
}
