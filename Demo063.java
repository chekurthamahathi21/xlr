public class Demo063 {
  public static void main(String[] args) {
      int[] array = {10, 20, 30, 40, 50}; // Example array

      // Check if the array has enough elements
      if (array.length >= 2) {
          int sum = array[0] + array[array.length - 1];
          System.out.println("Sum of first and last element: " + sum);
      } else {
          System.out.println("The array does not have enough elements.");
      }
  }
}
