package ykostrub.cn.ua.strings;

import java.util.Arrays;
import java.util.Random;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class MatrixInterview {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    int [][] m = new int [5][5];
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        m[i][j] = new Random().nextInt(10);
      }
      
    }
   printMatrix(m);
   rotateMatrix(m, m.length);
   System.out.println("===========================================");
   printMatrix(m);
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
