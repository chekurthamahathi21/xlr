import java.util.Scanner;
public class Demo039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); 
        if (character >= 'A' && character <= 'Z') {
            System.out.println("The character '" + character + "' is an uppercase letter.");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println("The character '" + character + "' is a lowercase letter.");
        } else if (character >= '0' && character <= '9') {
            System.out.println("The character '" + character + "' is a digit.");
        } else {
            System.out.println("The character '" + character + "' is neither a letter nor a digit.");
        }
        scanner.close();
    }
}

