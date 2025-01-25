import java.util.Scanner;
public class Demo037{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        System.out.print("Enter the fourth number: ");
        int number4 = scanner.nextInt();
        int largest;
        if (number1 >= number2 && number1 >= number3 && number1 >= number4) {
            largest = number1;
        } else if (number2 >= number1 && number2 >= number3 && number2 >= number4) {
            largest = number2;
        } else if (number3 >= number1 && number3 >= number2 && number3 >= number4) {
            largest = number3;
        } else {
            largest = number4;
        }
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}

