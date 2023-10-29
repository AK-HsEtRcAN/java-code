import java.util.Scanner;
public class Str2a{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inStr = dd.nextLine();
        System.out.print("Enter a character or substring to search: ");
        String searchKey = dd.nextLine();
        int firstOccurrence = inStr.indexOf(searchKey);
        int lastOccurrence =inStr.lastIndexOf(searchKey);
        System.out.println("First occurrence: " + (firstOccurrence != -1 ? firstOccurrence : "-1"));
        System.out.println("Last occurrence: " + (lastOccurrence != -1 ? lastOccurrence : "1-"));
        dd.close();
    }
}