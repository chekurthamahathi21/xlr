import java.util.Scanner;

public class Demo29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = new String[10];

        System.out.println("Enter 10 friends' names:");
        for (int i = 0; i < 10; i++) {
            friends[i] = scanner.nextLine();
        }

        System.out.println("Your friends' names are:");
        for (String name : friends) {
            System.out.println(name);
        }

        scanner.close();
    }
}