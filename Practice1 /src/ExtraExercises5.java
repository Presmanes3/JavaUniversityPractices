import upv.etsit.Plot2D;
import upv.etsit.Sequence;
import upv.etsit.Table;

/*Create an object of type Table with the data stored in ruido.csv and store the values of columns 1 to 4 in
four different objects of type Sequence. Then, create an object of type Plot2D and plot the four sequences with
legends “Aragon”, “Ayto.”, “J. Austria” and “P. Silla” respectively. Then, set the title “Noise level along May”,
set the label for x axis “Day”, set the label for y axis “dB.”, set the range for x axis [1-31] with tick value = 1
and set the range for y axis [50-70] with tick value = 1. Finally, show the plot*/

public class ExtraExercises5{
    public static void main(String[] args){

        System.out.println("Creating Table with ruido.csv raw data!"); // debug

        Table noiseTable = new Table("CSVFiles/ruido.csv",';'); // create table

        Sequence firstRow = new Sequence();
        Sequence[] columns = new Sequence[4];

        firstRow = noiseTable.getRow(0);   // Titles row
        columns[0] = noiseTable.getCol(1); // Aragon sequence
        columns[1] = noiseTable.getCol(2); // Ayuntamiento sequence
        columns[2] = noiseTable.getCol(3); // D. Juan Austria sequence
        columns[3] = noiseTable.getCol(4); // P. Silla sequence

        String[] firstRowTitles = new String[5];

        firstRowTitles = firstRow.getData();
        // System.out.println(firstRowTitles[0]); // debug

        Plot2D columnsPlot = new Plot2D();

        columnsPlot.setTitle("Noise level among May");
        columnsPlot.setXLabel("Day");
        columnsPlot.setYLabel("dB");
        columnsPlot.setXRange(1,31,1);
        columnsPlot.setYRange(50,70,1);

       for(int columnID = 0; columnID < columns.length; columnID++){ // debug
            columnsPlot.plot(columns[columnID], firstRowTitles[columnID]);
        }
        columnsPlot.show();

    }
}