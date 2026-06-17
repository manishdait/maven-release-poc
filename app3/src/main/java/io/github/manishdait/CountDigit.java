package io.github.manishdait;

public class CountDigit {
  public static void run() {
    int n = 34;
    System.out.println(count(n));
  }

  static int count(int n) {
    // int count = 0;

    // while (n != 0) {
    //   count++;
    //   n /= 10;
    // }

    // return count;

    return (int) Math.log10(n) + 1;
  }
}