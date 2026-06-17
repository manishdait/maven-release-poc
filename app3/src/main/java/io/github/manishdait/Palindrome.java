package io.github.manishdait;

public class Palindrome {
  public static void run() {
    int n = 4554;
    System.out.println(palindrome(n));
  }

  static boolean palindrome(int n) {
    int tmp = n;
    int rev = 0;

    while (n != 0) {
      int rem = n % 10;
      rev = rev * 10 + rem;
      n /= 10;
    }

    return tmp == rev;
  }
}
