package ykostrub.cn.ua.matrix;

import java.util.Arrays;
import java.util.Random;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class RotateMatrix {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    int size = 5;
    
    int [][] matrix = new int [size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        matrix[i][j] = new Random().nextInt(10);
      }
    }
    printMatrix(matrix);
    rotateMatrix(matrix, size);
    System.out.println("--------------------------------------------");
    printMatrix(matrix);
    
    

  }


  public static void rotateMatrix(int [][] m, int n){
    for (int layer = 0; layer < n/2; layer++) {
      int first = layer;
      int last = n - 1 - layer;
      for(int i = first; i < last; ++i){
        int offset = i - first;
        // save top
        int top = m[first][i];
        // left -> top
        m[first][i] = m[last - offset][first];
        //bottom -> left
        m[last - offset][first] =  m[last][last - offset];
        // right -> bottom
        m[last][last - offset] = m[i][last];
        // top -> right
        m[i][last] = top;
        
      }
      
    }
    
    
    
  }



  private static void printMatrix(int [][] m){
    for (int i = 0; i < m.length; i++) {
      System.out.println(Arrays.toString(m[i]));
    }
    
  }

}
