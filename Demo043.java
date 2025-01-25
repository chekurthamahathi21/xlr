import java.util.Scanner;
public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an uppercase character: ");
        char character = scanner.next().charAt(0); 
        if (character >= 'A' && character <= 'Z') {
            char lowercaseCharacter = (char) (character + 'a' - 'A');
            System.out.println("The lowercase of '" + character + "' is: '" + lowercaseCharacter + "'");
        } else {
            System.out.println("The entered character is not an uppercase letter.");
        }
        scanner.close();
    }
}

