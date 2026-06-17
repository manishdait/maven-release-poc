package io.github.manishdait;

import java.util.Arrays;

public class Rotate90 {
  public static void run() {
    int[][] mat = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    for (int[] arr : mat) {
      System.out.println(Arrays.toString(arr));
    }

    System.out.println("\n");
    
    rotate(mat);
    for (int[] arr : mat) {
      System.out.println(Arrays.toString(arr));
    }
  }

  static void rotate(int[][] mat) {
    /*
    int[][] tmp = new int[mat.length][mat.length];
    int n = mat.length - 1;

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        tmp[j][n - i] = mat[i][j];
      }
    }

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        mat[i][j] = tmp[i][j];
      }
    }
    */

    /* Transpose */
    for (int i = 0; i < mat.length; i++) {
      for (int j = i+1; j < mat.length; j++) {
        int tmp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = tmp;
      } 
    }

    /* Reverse */
    for (int i = 0; i < mat.length; i++) {
      int s = 0;
      int e = mat[i].length - 1;

      while (s <= e) {
        int tmp = mat[i][s];
        mat[i][s] = mat[i][e];
        mat[i][e] = tmp;
        s++;
        e--;
      }
    }
  }
}
