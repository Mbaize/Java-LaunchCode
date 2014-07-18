import java.io.Console;

import static java.lang.System.out;

/**
 * Created by Micah on 7/7/2014.
 */
public class Pset3Mario {

    public static void main(String[] varArgs) {

        int rows;
        String option;

        Pset3Mario mario = new Pset3Mario();

        rows = mario.checkRows();
        option = mario.checkPrint();

        Pyramid pyramid = new Pyramid(rows);

        //pyramid.builder(mario.rows);

        PrintFactory printFactory = new PrintFactory();

        Printer p = printFactory.getPrinter(option);
        //System.out.print(mario.option);
        p.print(pyramid);


    }

    private int checkRows() {

        int rows;
        String option;

        checker:
            do {
                out.print("How many rows high would you like the pyramid to be? (The number must be between 0 and 23, inclusive.) ");
                try {
                    rows = Integer.parseInt(System.console().readLine());
                }
                catch (NumberFormatException e) {
                    rows = -1;//makes the do while loop repeat since user entered a non-integer
                }
            } while (rows < 0 || rows > 23);
            return rows;
        }

    private String checkPrint() {

        int rows;
        String option;

        do {
            out.print("Press 'c' to print the pyramid on the console, or 'f' to send it to a text file.");
            option = System.console().readLine();
        } while ((!option.equalsIgnoreCase("c")) && (!option.equalsIgnoreCase("f")));
        return option;

    }
}







