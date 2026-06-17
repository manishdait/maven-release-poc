package io.github.manishdait;

public class GCD {
  public static void run() {
    int a = 18;
    int b = 12;

    System.out.println(gcd(a, b));
    System.out.println(lcm(a, b));
  }

  static int gcd(int a, int b) {
    /*
    int min = a < b? a : b;
    int gcd = 1;

    for (int i = 1; i <= min; i++) {
      if (a%i == 0 && b%i == 0) {
        gcd = i;
      }
    }

    return gcd;
    */

    /*
    int min = a < b? a : b;
    
    for(int i = min; i > 1; i--) {
      if (a%i == 0 && b%i == 0) {
        return i;
      }
    }

    return 1;
    */

    if (a == 0) {
      return b;
    }

    if (b == 0) {
      return a;
    }

    if (a > b) {
      return gcd(a%b, b);
    } else {
      return gcd(a, b%a);
    }
  }

  static int lcm(int a, int b) {
    return Math.abs(a * b) / gcd(a,b);
  }
}
