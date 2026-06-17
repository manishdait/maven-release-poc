package io.github.manishdait;

class PowerOf3 {
  public static void run() {

  }

  public boolean isPowerOfThree(int n) {
    if (n <= 0) {
      return false;
    }

    while (n%3 == 0) {
      n /= 3;
    }

    return n == 1;
  }

  /*
  Overflow int cause error

  public boolean isPowerOfThree(int n) {
    if (n <= 0) {
      return false;
    }

    int i = 1;
    while (i <= n) {
      if (i == n) {
        return true;
      }
            
      i *= 3;
    }
    return false;
  }
  */
  
  /*
   * Constant Approch
   */

  public boolean isPowerOfThreeConst(int n) {
    if (n <= 0) {
      return false;
    }
    
    // 3^19 = 1162261467 max that can fit in 32 bit integer
    int max = 1162261467;
    return max % n == 0;
  }
}