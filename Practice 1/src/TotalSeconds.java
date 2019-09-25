import java.util.Scanner;

public class TotalSeconds {

    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);

        int sec, hours, min;

        System.out.println("Indicate Seconds and I will give you total amount of Hours and Minutes");

        System.out.print("Seconds : ");
        sec = kbd.nextInt();

        hours = sec / 3600;
        min = sec/60;

        System.out.println("Total Hours : " + hours);
        System.out.println("Total Minutes : " + min);


    };
}
