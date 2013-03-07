package ykostrub.cn.ua.strings;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.RET;

// TODO: Auto-generated Javadoc
/**
 * The Class IsAnagrammStrings.
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class IsAnagrammStrings {

  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(
      String[] args) {
    String s1 = "asdaa";
    String s2 = "dsaas";
    System.out.println(isAnagramm(s1, s2));

  }

  /**
   * Checks if is anagramm.
   *
   * @param s1 the s1
   * @param s2 the s2
   * @return true, if is anagramm
   */
  private static boolean isAnagramm(
     final String s1,
     final String s2) {
    if (s1 == null || s2 == null) {
      return false;
    }
    if (s1.length() != s2.length()) {
      return false;
    }
    
    
    
   // return sortChars(s1).equals(sortChars(s2));
    
    int[] arr = new int[256];
    for(char c : s1.toCharArray()){
      int pos = (int) c;
      arr[pos] ++;
    }
    
    for(char c : s2.toCharArray()){
      int pos = (int) c;
      if(arr[pos] == 0) {
        return false;
      } else {
        arr[pos] --;
      }
    }

    return true;

  }
  
  
  
  private static String sortChars(final String s){
    if (s != null) {
      char [] ch = s.toCharArray();
      Arrays.sort(ch);
      return new String(ch);
    }
    return null;
  }
  

  

}
