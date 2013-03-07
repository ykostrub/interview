package ykostrub.cn.ua.strings;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class CompressString {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    String s = "aasssdqdddsdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
    System.out.println(compress(s));

  }

  private static String compress(
      final String s) {
    if (s != null && !s.isEmpty()) {
      StringBuilder sb = new StringBuilder();
      
      char last  = s.charAt(0);
      int count = 1;
      for(int i = 1; i < s.length(); i++ ){
        if (last == s.charAt(i)) {
          count ++;
        } else {
          sb.append(last).append(count);
          count = 1;
          last = s.charAt(i);
        }
      }
      System.out.println(getCountCompression(s));
      return getCountCompression(s) > s.length() ? s : sb.append(last).append(count).toString();
      
    }
    return null;
  }
  
  private static int getCountCompression(final String s){
    if (s != null && !s.isEmpty()) {
      char last  = s.charAt(0);
      int size = 0;
      int count = 1;
      for(int i = 1; i < s.length(); i++ ){
        if (last == s.charAt(i)) {
          count ++;
          last  = s.charAt(i);
        } else {
          size = size + 1 + String.valueOf(count).length();
          last  = s.charAt(i);
          count = 0;
        }
      }
      return size = size + 1 + String.valueOf(count).length();
    }
    
    return 0;
  }

}
