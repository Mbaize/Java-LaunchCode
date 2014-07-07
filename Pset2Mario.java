/**
 * Created by Micah on 7/2/2014.
 */


import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

public class Pset2Mario {
    String pyramid;

    public String pyramidBuilder(int rows) {


        StringBuilder stringBuilder = new StringBuilder();


        for (int i = 0; i < rows; i++) {


            for (int j = (rows - (i + 1)); j > 0; j--) {
                stringBuilder.append(" ");
            }

            for (int k = (i + 2); k > 0; k--) {
                stringBuilder.append("#");
            }

            stringBuilder.append("\r\n");

        }

        pyramid = stringBuilder.toString();
        return pyramid;
    }

    public static void main(String[] varArgs) {

        int rows;
        String option;
        Pset2Mario m = new Pset2Mario();

        do {
            Console c = System.console();
            out.print("How many rows high would you like the pyramid to be? (The number must be between 0 and 23, inclusive.) ");
            rows = Integer.parseInt(System.console().readLine());
        } while (rows < 0 || rows > 23);


        do {
            Console c = System.console();
            out.print("Press 'c' to print the pyramid on the console, or 'f' to send it to a text file.");
            option = System.console().readLine();
        } while ((!option.equals("c")) && (!option.equals("f")));

        m.pyramidBuilder(rows);

        if (option.equals("c")) {
            out.print(m.pyramid);
        } else {
            try {
                writeFile(m.pyramid);
            } catch (IOException e) {
                out.print("Caught IOException" + e.getMessage());
            }
        }
    }

    public static void writeFile(String pyramid) throws IOException {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("mario.txt"));
            out.print(pyramid);
            out.close();
        } catch (IOException e) {
            out.print("Caught IOException" + e.getMessage());
        }

    }


}
