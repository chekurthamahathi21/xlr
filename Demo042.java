import java.util.Scanner;
public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a lowercase character: ");
        char character = scanner.next().charAt(0); 
        if (character >= 'a' && character <= 'z') {
            char uppercaseCharacter = (char) (character - 'a' + 'A');
            System.out.println("The uppercase of '" + character + "' is: '" + uppercaseCharacter + "'");
        } else {
            System.out.println("The entered character is not a lowercase letter.");
        }
        scanner.close();
    }
}

