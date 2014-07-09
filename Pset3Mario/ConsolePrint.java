import static java.lang.System.out;

/**
 * Created by Micah on 7/7/2014.
 */
public class ConsolePrint implements Printer {


    public void print(Pyramid pyramid) {

        //int rows = pyramid.getRows();
        //System.out.print(rows);
        StringBuilder printString = pyramid.builder();
        out.print(printString.toString());
    }
}
