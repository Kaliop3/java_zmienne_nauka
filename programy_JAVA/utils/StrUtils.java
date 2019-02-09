package pl.klaudialason.programy_JAVA.utils;

public class StrUtils {

  public static String removeLastSeparator(String text, String separator){
      return text.substring(0,text.lastIndexOf(separator));
  }
}
