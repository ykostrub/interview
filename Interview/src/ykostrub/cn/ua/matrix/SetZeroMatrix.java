package ykostrub.cn.ua.matrix;

import java.util.Arrays;
import java.util.Random;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class SetZeroMatrix {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    int size = 5;

    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrix[i][j] = new Random().nextInt(10);
      }
    }
    printMatrix(matrix);
    printMatrix(setZero(matrix));
    

    

  }
  private static int [][]  setZero(int[][] m){
    boolean [] row = new boolean [m.length];
    boolean [] collumn = new boolean[m[0].length];
    
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        if (m[i][j] == 0) {
          row[i] = true;
          collumn[j] = true;
        }
      }
    }
    
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        if (row[i] || collumn[j]) {
          m[i][j] = 0;
        }
      }
    }
    
    
    
    return m;
  }
  
  private static void printMatrix(
      int[][] m) {
    for (int i = 0; i < m.length; i++) {
      System.out.println(Arrays.toString(m[i]));
    }
    System.out.println("====================================");

  }
  
}
