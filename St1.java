
import java.util.Scanner;

 class Str1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a statement: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder r = new StringBuilder(input);

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            r.setCharAt(i, (char) (currentChar - ('a' - 'A')));
        }

        System.out.println("Uppercase statement: " + r.toString());
    }
}