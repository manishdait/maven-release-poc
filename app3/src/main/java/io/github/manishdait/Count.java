package io.github.manishdait;

public class Count {
  public static void run() {
    int n = 12345;
    System.out.println(count(n));
  }

  static int count(int n) {
    /*
      int count = 0;

      while (n != 0) {
        count++;
        n /= 10;
      }

      return count;
    */
    return (int) Math.log10(n)  + 1;
  }
}
