package io.github.manishdait;

public class Pattern5 {
  public static void run() {
    print(5);
  }
  
  static void print(int n) {
    for (int i = 5; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
