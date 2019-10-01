import java.util.Scanner;

public class SecondGradeEquation {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Lets solve some second grade equations! Ax^2 + Bx + C");

        int noGrade, grade1, grade2 = 0;
        boolean canCompute = true;

        System.out.print("Introduce number 'A' : ");
        grade2 = kbd.nextInt(); // Grade 2

        System.out.print("Introduce number 'B' : ");
        grade1 = kbd.nextInt(); // Grade 1

        System.out.print("Introduce number 'C' : ");
        noGrade = kbd.nextInt(); // noGrade

        System.out.println("Your equation is : " + grade2 + "x^2" + "+" + grade1 + "x" + "+" + noGrade);

        if (grade2 == 0 && grade1 == 0) {
            System.out.println(
                    "Grade2 and Grade1 are both 0 so the result would be 0x^2 + 0x + C = 0 which is only valid for C = 0!");
            canCompute = false;
        } else if (grade2 == 0) { // Simple equation just solve for X

            canCompute = false;
            System.out.println("Simple equation!");
            System.out.println("x = " + ((-noGrade) / grade1));

        } else if (grade1 == 0) { // Compute the square root

            canCompute = false;

            double numberToBeSquared = (-noGrade) / grade2;

            if (numberToBeSquared < 0) { // If the division is less than one we have an imaginary number
                System.out.println("Imaginary number!");
            } else { // Else we can computate the result
                System.out.println("x = " + "+/-   " + Math.sqrt(numberToBeSquared));
            }

        }

        if (canCompute == true) {
            double xSolution1, xSolution2;

            double negativeB, bSquare, negativeFourTimesATimesC, twoTimesA;

            // This part could be discarted but it is useful for debugging
            negativeB = -grade1;
            bSquare = grade1 * grade1;
            negativeFourTimesATimesC = -4 * grade2 * noGrade;
            twoTimesA = 2 * grade2;

            if ((bSquare + negativeFourTimesATimesC) < 0) {
                System.out.println("Imaginary number!");
            } else {
                xSolution1 = (negativeB + Math.sqrt(bSquare + negativeFourTimesATimesC)) / twoTimesA; // Solution 1
                xSolution2 = (negativeB - Math.sqrt(bSquare + negativeFourTimesATimesC)) / twoTimesA; // Solution 2

                System.out.println("x1 = " + xSolution1);
                System.out.println("x2 = " + xSolution2);
            }
        }

        kbd.close();

    }

}