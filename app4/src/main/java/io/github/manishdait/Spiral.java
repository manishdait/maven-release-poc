package io.github.manishdait;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Spiral {
  public static void run() {
    int[][] mat = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };

    for (int[] arr : mat) {
      System.out.println(Arrays.toString(arr));
    }

    System.out.println("\n");
    System.out.println(spiral(mat));
  }

  static List<Integer> spiral(int[][] mat) {
    List<Integer> list = new ArrayList<>();

    int left = 0;
    int top = 0;
    int right = mat[0].length - 1;
    int bottom = mat.length - 1;

    while(top <= bottom && left <= right) {
      for (int i = left; i <= right; i++) {
        list.add(mat[top][i]);
      }
      top++;

      
      for (int i = top; i <= bottom; i++) {
        list.add(mat[i][right]);
      }
     
      right--;
   

      if (left <= right) {
        for (int i = right; i >= left; i--) {
          list.add(mat[bottom][i]);
        }
      
        bottom--;
      }

      if (top <= bottom) {
        for (int i = bottom; i >= top; i--) {
          list.add(mat[i][left]);
        }
     
        left++;
      }
    }

    return list;
  }
}
