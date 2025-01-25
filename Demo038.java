import java.util.Scanner;
public class Demo038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        if (character >= 'A' && character <= 'Z') {
            System.out.println("The character '" + character + "' is uppercase.");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println("The character '" + character + "' is lowercase.");
        } else {
            System.out.println("The character '" + character + "' is not a letter.");
        }
        scanner.close();
    }
}

