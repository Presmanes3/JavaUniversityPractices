import java.util.Locale;
import java.util.Scanner;

public class Email {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Please, introduce your email format like this > 'username@domain'");
        System.out.print("Input : ");
        String email = myScanner.nextLine();

        // System.out.println("You have introduced : "+ input);

        String input[] = email.split("@", 2);
        String username = input[0];
        String domain = input[1];

        System.out.println("Username : " + username);
        System.out.println("Domain : " + domain);

        String web = "https://";

        web = web + domain + "/" + username;

        System.out.println("Web : " + web);

    }
}
