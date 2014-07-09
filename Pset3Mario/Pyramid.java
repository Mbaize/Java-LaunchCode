import java.io.Console;
import java.lang.*;
import static java.lang.System.out;

/**
 * Created by Micah on 7/7/2014.
 */
public class Pyramid {

       int rows;

        StringBuilder stringBuilder = new StringBuilder();

        public Pyramid(int rows) {
            this.rows = rows;
        }

        //creates a new StringBuilder based on the number of rows of the instantiated pyramid
        public StringBuilder builder() {


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

}
