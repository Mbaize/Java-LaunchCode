import java.io.Console;
import java.lang.*;
import static java.lang.System.out;

/**
 * Created by Micah on 7/7/2014.
 */
public class Pyramid {

    int rows;

    public Pyramid(int rows) {
        this.rows = rows;
    }



    public StringBuilder builder() {

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

        return stringBuilder;
    }

    public int getRows() {
        return this.rows;
    }
    /*public String getOption() {
        return option;
    }*/
}
