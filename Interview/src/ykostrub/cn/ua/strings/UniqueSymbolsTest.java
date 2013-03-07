package ykostrub.cn.ua.strings;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class UniqueSymbolsTest {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    String s = "asdfg";
    System.out.println(isUniqueSymbolsInString(s));

    
  }
  
  // ASCII symbols (256)
  private static boolean isUniqueSymbolsInString(final String str){
    if(str == null || str.length() == 0) return true;
    if(str.length() > 256) return false;
    
    boolean[] arr = new boolean[256];
    
    for(char c : str.toCharArray()){
      int temp = (int)c;
      System.out.println(c);
      if(arr[temp]){
        return false;
      } else {
        arr[temp] = true;
      }
    }
    return true;
    
  }

}
