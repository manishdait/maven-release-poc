package io.github.manishdait;

public class Armstrong {
  public static void run() {
    int n = 153;
    System.out.println(armstrong(n));
  }

  static boolean armstrong(int n) {
    int tmp = n;
    int pow = (int) Math.log10(n) + 1;
    int arm = 0;

    while (n != 0) {
      int rem = n % 10;
      
      /* 
      int mul = 1;
      for (int i = 0; i < pow; i++) {
        mul *= rem;
      }

      arm += mul;
      */

      arm += (int) Math.pow(rem,pow);
      n /= 10;
    }

    return arm == tmp;
  }
}
