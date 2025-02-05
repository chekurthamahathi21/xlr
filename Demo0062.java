public class Demo0062 {
  public static void main(String[] args) {
             int[] array = {10, 20, 30, 40, 50}; // Example array
     
             // Check if the array has enough elements
             if (array.length >= 2) {
                 System.out.println("First element: " + array[0]);
                 System.out.println("Second element: " + array[1]);
                 System.out.println("Last element: " + array[array.length - 1]);
             } else {
                 System.out.println("The array does not have enough elements.");
             }
         }
     }
