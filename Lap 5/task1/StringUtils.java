package task1;

public class StringUtils {
    public static String longerString(String s1,String s2, StringCompare functionInterface){
          return functionInterface.betterString(s1,s2) ? s1 : s2;
    }
}
