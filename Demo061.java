public class Demo061 {
  public static void main(String[] args) {
      int count;
      for (int i = 2; i <= 10; i++) {
          count = 0;
          for (int j = 1; j <= i; j++) {
              if (i % j == 0) {
                  count++;
              }
          }
          if (count == 2) {
              System.out.println(i);
          }
      }
  }
}
