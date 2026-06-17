package io.github.manishdait;

public class Pow {
  public static void run() {
    double x = 2.1;
    int n = 3;

    System.out.println(expo(x, n));
  }

  static double pow(double x, int n) {
    double pow = 1;
    long nn = n;
    if (nn < 0) {
      nn *= -1;
    }

    for (long i = 0; i < nn; i++) {
      pow *= x;
    }

    //
    // For negative n Negative 2^-2 = 1/(2^2)
    if (n < 0) {
      pow = 1 / pow;
    }
    // 

    return pow;
  }

  static double rec(double x, int n) {
    double pow = recPow(x, Math.abs(n));
    if (n < 0) {
      pow = 1 / pow;
    }
    return pow;
  }

  static double recPow(double x, int n) {
    if (n == 0) {
      return 1;
    }

    return x * recPow(x, n - 1);
  }

  // exponential

  static double expo(double x, int n) {
    long nn = n;
    if (nn < 0) {
      nn *= -1;
    }
     // Math.abs() for -limit give int so ve get val back
    double ans = 1;
    while (nn > 0) {
      if (nn % 2 == 0) {
        x = x * x;
        nn = nn / 2;
      } else {
        ans = ans * x;
        nn = nn - 1;
      }
    }

    if (n < 0) {
      ans = 1 / ans;
    }

    return ans;
  }
}
