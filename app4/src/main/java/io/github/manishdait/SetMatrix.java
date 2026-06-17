package io.github.manishdait;

import java.util.Arrays;

public class SetMatrix {
  public static void run() {
    int[][] mat = {
      {1,1,1},
      {1,0,1},
      {1,1,1}
    };

    for (int[] arr : mat) {
      System.out.println(Arrays.toString(arr));
    }

    setZero(mat);
    System.out.println("\n");

    for (int[] arr : mat) {
      System.out.println(Arrays.toString(arr));
    }
  }

  static void setZero(int[][] mat) {
    /*
    boolean[] row = new boolean[mat.length];
    boolean[] col = new boolean[mat[0].length];

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == 0) {
          row[i] = true;
          col[j] = true;
        }
      }
    }

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (row[i] || col[j]) {
          mat[i][j] = 0;
        }
      }
    }
    */

    int r0 = 1;

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == 0) {
          if (i == 0) {
            r0 = 0;
          } else {
            mat[i][0] = 0;
          }

          mat[0][j] = 0;
        }
      }
    }

    for (int i = 1; i < mat.length; i++) {
      for (int j = 1; j < mat[i].length; j++) {
        if (mat[i][0] == 0 || mat[0][j] == 0) {
          mat[i][j] = 0;
        }
      }
    }

    if (mat[0][0] == 0) {
     for (int i = 1; i < mat.length; i++) {
       mat[i][0] = 0;
     }
    }

    if (r0 == 0) {
      for (int j = 0; j < mat[0].length; j++) {
        mat[0][j] = 0;
      }
    }
  }
}
