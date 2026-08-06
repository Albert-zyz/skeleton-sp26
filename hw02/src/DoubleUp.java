public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      // TODO: Fill in this function
      int count = s.length();
      String str = String.valueOf(s.charAt(0));
      str += s.charAt(0);
      for (int i = 1; i < count; ++i){
         char a = s.charAt(i);
         str += a;
         str += a;
      }
      return str;
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}