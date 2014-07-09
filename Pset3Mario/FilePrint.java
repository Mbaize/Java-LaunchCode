import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Micah on 7/7/2014.
 */
public class FilePrint implements Printer {

    //method will send converted string from pyramid object to file
    public void print(Pyramid pyramid) {


        PrintWriter out = null;
        //rows = mario.getRows();
        StringBuilder printString = pyramid.builder();

        try {
            out = new PrintWriter(new FileWriter("pyramid.txt"));
            out.print(printString.toString());
            out.close();
        } catch (IOException e) {
            out.print("Caught IOException" + e.getMessage());
        }

    }
}
