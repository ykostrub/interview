package ykostrub.cn.ua.strings;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class StringTestInterview {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    String s = "bsba";
    String s2 = "sbba";
    // System.out.println(isUniqueSymbols(s));
    // System.out.println(isUniqueChars(s));
    System.out.println(isAnagrammString(s, s2));
    System.out.println(permutation(s, s2));
    System.out.println(replaseSpace("asd  asd "));
    System.out.println(compresStringBad("asdaaass"));
    int count  = 5;
    System.out.println(String.valueOf(count).length());

  }

  // for strings on lower case
  public static boolean isUniqueChars(
      String s) {
    if (s.length() > 256) {
      return false;
    }
    int checker = 0;
    for (int i = 0; i < s.length(); i++) {
      System.out.println(s.charAt(i));
      int val = s.charAt(i) - 'a';
      System.out.println("val =" + val);
      System.out.println("checker =" + checker);
      System.out.println(String.format("checker= %32s", Integer.toBinaryString(checker)).replace(
          ' ', '0'));
      System.out.println(String.format("val= %32s", Integer.toBinaryString(val)).replace(' ', '0'));

      System.out.println(String.format("1<<val= %32s", Integer.toBinaryString(1 << val)).replace(
          ' ', '0'));

      System.out.println("(1<<val) = " + (1 << val));
      System.out.println("(checker & (1<<val) = " + (checker & (1 << val)));

      if ((checker & (1 << val)) > 0) {
        return false;
      }
      checker |= (1 << val);

      System.out.println(String.format("checker_after= %32s", Integer.toBinaryString(checker))
          .replace(' ', '0'));
      System.out.println("----------------------------------------");
    }

    return true;
  }

  // for ASCII encoding
  private static boolean isUniqueSymbols(
      final String string) {
    if (string == null || string.length() > 256) {
      return false;
    }

    boolean[] chars = new boolean[256];
    for (int i = 0; i < string.length(); i++) {
      int pos = string.charAt(i);
      if (chars[pos]) {
        return false;
      }
      chars[pos] = true;

    }
    return true;
  }

  public static final byte[] intToByteArray(
      int value) {
    return new byte[] {(byte) (value >>> 24), (byte) (value >>> 16), (byte) (value >>> 8),
        (byte) value};
  }

  private static String sort(
      String s) {
    char[] content = s.toCharArray();
    Arrays.sort(content);
    return new String(content);

  }

  private static boolean isAnagrammString(
      final String s1,
      final String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    return sort(s2).equals(sort(s1));
  }

  private static boolean permutation(
      final String s1,
      final String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    int[] letters = new int[256];// ASCII
    for (char ch : s1.toCharArray()) {
      letters[ch]++;
    }

    for (int i = 0; i < s2.length(); i++) {
      if (--letters[s2.charAt(i)] < 0) {
        return false;
      }
    }

    return true;
  }

  private static String replaseSpace(
      final String s) {

    int length = s.length();
    int spaceCount = 0;
    for (char c : s.toCharArray()) {
      if (c == ' ') {
        spaceCount++;
      }
    }

    int newLength = length + spaceCount * 2;

    char[] newString = new char[newLength];
    for (int i = s.length() - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ') {
        newString[newLength - 1] = '0';
        newString[newLength - 2] = '2';
        newString[newLength - 3] = '%';
        newLength = newLength - 3;
      } else {
        newString[newLength - 1] = s.charAt(i);
        newLength = newLength - 1;
      }
    }
    return new String(newString);

  }

  public static String compresStringBad(
      final String s) {
    String newString = "";
    char last = s.charAt(0);
    int count = 1;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == last) {
        count++;
      } else {
        newString = newString + last + count;
        count = 1;
        last = s.charAt(i);
      }

    }
    return newString + last + count;

  }

}
