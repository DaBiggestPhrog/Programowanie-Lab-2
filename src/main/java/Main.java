public class Main {
  public static void main(String[] args) {
      String Zaba = "Hello Word";

      for (int i = 0; i < Zaba.length(); i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
          System.out.println(Zaba.charAt(i));
      }
  }
}