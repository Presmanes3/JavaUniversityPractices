import java.util.Scanner;
import java.util.Locale;

public class PersonThroughEarth {

    public static void main (String[] args){

        Scanner myScanner = new Scanner(System.in).useLocale(Locale.US);

        double PI = Math.PI;

        double earthRadius = 6371; //meters
        double moonRadius = 1737; // meters
        double personHeight;
 

        System.out.println("We are going to calculate which part of the human body travel more distance!");

        System.out.print("Please, enter person Height : ");
        personHeight = myScanner.nextDouble();

        System.out.println(">>> Calculus for Earth");

        double distanceHeadEarth = 2 * PI * (earthRadius + personHeight);
        double distanceFeetEarth = 2 * PI * earthRadius;

        System.out.println("Distance traveled by head : " +  distanceHeadEarth );

        System.out.println("Distance traveled by feet : " +  distanceFeetEarth);

        double differenceEarth = distanceHeadEarth - distanceFeetEarth;

        System.out.println("Difference between head and feet on Earth is : " + differenceEarth);

        System.out.println();

        double distanceHeadMoon = 2 * PI * (moonRadius + personHeight);
        double distanceFeetMoon = 2 * PI * moonRadius;

        System.out.println(">>> Calculus for Moon");

        System.out.println("Distance traveled by head : " +  distanceHeadMoon );

        System.out.println("Distance traveled by feet : " +  distanceFeetMoon);

        double differenceMoon = distanceHeadMoon - distanceFeetMoon;

        System.out.println("Difference between head and feet on Moon is : " + differenceMoon);


    }
}
