package io.github.manishdait;

public class IsSortedArray {
 public static void run() {
  int[] arr = {3,4,5,1,2};
  System.out.println(sorted(arr));
 } 

 static boolean sorted(int[] arr) {
  boolean rotated = false;

  for (int i = 0; i < arr.length; i++) {
    if (arr[i] > arr[(i+1) % arr.length]) { // to check single decent
      if (rotated) {
        return false;
      }

      rotated = true;
    }
  }

  return true;
 }
}
