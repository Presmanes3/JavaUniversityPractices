import java.util.Scanner;
import java.util.Locale;

public class InputTest {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in).useLocale(Locale.US);
        String name;
        int age;
        double weight;

        System.out.print("Enter your name : ");
        name = myScanner.nextLine();

        System.out.print("Enter your age : ");
        age = myScanner.nextInt();

        System.out.print("Enter your weight : ");
        weight = myScanner.nextDouble();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your weight is " + weight + " kg");
    }
}
