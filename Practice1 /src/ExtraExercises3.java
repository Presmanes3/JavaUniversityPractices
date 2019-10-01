import upv.etsit.Sequence;
import upv.etsit.Table;

import java.util.Scanner;

/* Create an object of type Table with the data stored in ruido.csv, obtain the first row (index 0) which contains
the header of each column and print this row on the screen. Then, ask the user to enter a column name (which
should be one of the names printed in the previous step). Finally, print the maximum, the minimum and the
mean of the values contained in the column specified by the user.*/

public class ExtraExercises3 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Creating Table with ruido.csv raw data!"); // debug

        Table noiseTable = new Table("CSVFiles/ruido.csv",';'); // create table

        Sequence firstRow = new Sequence(); // Create new Sequence to store first row
        firstRow = noiseTable.getRow(0); // Add values

        // firstRow.print(); // debug

        String[] firstRowString = new String[10]; //create a string
        firstRowString = firstRow.getData(); // get data as String[]

        int firstRowLength = firstRowString.length;

        /*==================================== SPLITTER ============================================================*/

        System.out.println("\n=====   =====   =====   Column list   =====   =====   =====");
        for( int columnID = 1; columnID < firstRowLength; columnID++ ){
            System.out.println("Column " + columnID + " : " + firstRowString[columnID]);
        }

        System.out.println();
        System.out.print("Please Select one column : ");
        int columnPositionSelected = kbd.nextInt();

        while(columnPositionSelected >= firstRowLength || columnPositionSelected < 1){
            System.out.print("Please Select one correct column : ");
            columnPositionSelected = kbd.nextInt();
        }

        Sequence columnSelected = new Sequence();

        columnSelected = noiseTable.getCol(columnPositionSelected);
        //double max = columnSelected.max();
        System.out.println();
        System.out.println("=====   =====   =====   " +firstRowString[columnPositionSelected] +"   =====   =====   =====");
        System.out.print("Maximum value : ");
        System.out.println(columnSelected.max());
        System.out.print("Minimum value : ");
        System.out.println(columnSelected.min());
        System.out.print("Mean value : ");
        System.out.println(columnSelected.mean());

    }
}