import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        String Uppercase, Lowercase;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name/word/statement in Lowercase");
        Lowercase=scan.nextLine();
        Uppercase =Lowercase.toUpperCase();
        System.out.println("The uppercase equivalent of " + Lowercase + " is " + Uppercase);
        System.out.println("\n");
        System.out.println("Enter a name/word/statement in Uppercase");
        Uppercase = scan.nextLine();
        Lowercase = Uppercase.toLowerCase();
        System.out.println("The lowercase equivalent of" + Uppercase + " is " + Lowercase);
    }
}

