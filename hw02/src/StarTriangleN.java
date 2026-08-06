public class StarTriangleN {
   /**
     * Prints a right-aligned triangle of stars ('*') with N lines.
     * The first row contains 1 star, the second 2 stars, and so on. 
     */
   private static void printChar(char c, int count){
      for (int i = 0; i < count; ++i){
         IO.print(c);
      }
   }
   public static void starTriangle(int N) {
      // TODO: Fill in this function
      String space = " ";
      String star = "*";
      for (int i = 1; i <= N; ++i){
         printChar(' ', N-i);
         printChar('*', i);
         IO.println();
      }
   }
   
   public static void main(String[] args) {
      starTriangle(7);
   }
}