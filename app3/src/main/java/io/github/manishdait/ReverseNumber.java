package io.github.manishdait;

public class ReverseNumber {
  public static void run() {
    int n = -12345;
    System.out.println(n);
    System.out.println(reverse(n));
  }

  static int reverse(int n) {
    int rev = 0;

    while (n != 0) {
      int rem = n % 10;
      rev = rev * 10 + rem;
      n /= 10;      
    }

    return rev;
  }
}
